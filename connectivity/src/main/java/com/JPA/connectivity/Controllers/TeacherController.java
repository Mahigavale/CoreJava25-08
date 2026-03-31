package com.JPA.connectivity.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.connectivity.Entity.Teacher;
import com.JPA.connectivity.Service.Teacher_service;
import com.JPA.connectivity.dtos.TeacherDto;

@RestController
public class TeacherController {

	
	@Autowired
	private Teacher_service service;
	
	@Autowired
	private ApplicationContext context;
	
	
	@PostMapping("/add-teacher")
	public String add(@RequestBody Teacher teach)
	{
		
		
		return service.addTeacher(teach);
	}
	
	@GetMapping("/get-teacher")
	public List<TeacherDto> getall()
	{
		System.out.println("**************");
		System.out.println(context.getBeanDefinitionCount());
		System.out.println("*****************");
		return service.getAll();
	}
	
	@GetMapping("/get-by-name/{name}")
	public List<Teacher> getname(@PathVariable(value="name")String name)
	{
		return service.getbyname(name);
	}
	
	
	
	@PutMapping("/updateemail/{id}/{email}")
	public int update(@PathVariable(value="id") int id, @PathVariable(value="email") String email)
	{
		return service.updateemailbyid(id, email);
	}

}

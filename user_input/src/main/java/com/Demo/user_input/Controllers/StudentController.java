package com.Demo.user_input.Controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.Demo.user_input.Classes.Student;
import com.Demo.user_input.Service.StudentService;

@RestController
public class StudentController {

	
	@Autowired
	private StudentService service;
	
	
	
	@PostMapping("/add-student")
	public String add(@RequestBody Student stud)
	{
		return service.addStudent(stud);
	}
	
	@GetMapping("/get-all")
	public List<Student> getall()
	{
		return service.getall();
	}
	
	@GetMapping("/get-h")
	public int gethmarks()
	{
		return service.getHighestmarks();
	}

}

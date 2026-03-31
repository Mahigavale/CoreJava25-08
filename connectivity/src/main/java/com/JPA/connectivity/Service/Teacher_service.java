package com.JPA.connectivity.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.connectivity.Entity.Teacher;
import com.JPA.connectivity.Repository.Teacher_Repo;
import com.JPA.connectivity.dtos.TeacherDto;

@Service
public class Teacher_service {

	
	@Autowired
	private Teacher_Repo repo;
	
	public String  addTeacher(Teacher t)
	{
		
		System.out.println(t.getId()+"::::");
		repo.save(t);
		return t.getName() +"a dded sucessfully..";
	
	}
	
	public List<TeacherDto>  getAll()
	{
	 List<Teacher> list=repo.findAll();
	 
	 return  list.stream().map((teacher)->(TeacherDto.convert(teacher)))
	 .collect(Collectors.toList());
	}
	
	
	public List<Teacher> getbyname(String name)
	{
		return repo.getByName(name);
	}
	
	
	public int updateemailbyid(int id, String email)
	{
		return repo.updateemail(id,email);
	}
}

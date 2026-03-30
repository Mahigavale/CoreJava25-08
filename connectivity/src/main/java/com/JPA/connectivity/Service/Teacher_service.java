package com.JPA.connectivity.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.connectivity.Entity.Teacher;
import com.JPA.connectivity.Repository.Teacher_Repo;

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
	
	public List<Teacher>  getAll()
	{
	 return 	 repo.findAll();
	}
	
	
	public List<Teacher> getbyname(String name)
	{
		return repo.getByName(name);
	}
}

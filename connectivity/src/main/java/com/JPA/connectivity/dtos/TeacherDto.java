package com.JPA.connectivity.dtos;

import com.JPA.connectivity.Entity.Teacher;

public class TeacherDto {

	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public  static TeacherDto convert(Teacher teach)
	{
		TeacherDto dto=new TeacherDto();
		
		dto.setId(teach.getId());
		dto.setName(teach.getName());
		
		return dto;
	}
	
}

package com.Demo.user_input.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.Demo.user_input.Classes.Student;

@Service
public class StudentService {
	
	
	
	List<Student> list=new ArrayList<Student>();
	
	
	public String addStudent( Student stud)
	{
		 list.add(stud);
		 
		 return stud.getName()+ ":: is added successfully !";
	}

	
	public List<Student> getall()
	{
		return list;
		
	}
	
	
	public int getHighestmarks()
	{
		
	
    
	Optional<Integer> max= list.stream().map((i)->(i.getMarks()))
			.collect(Collectors.toList()).stream()
			.map((mn)->{
    	          return mn.stream().
    			  reduce(0,(z,x)->(z+x));})
			.collect(Collectors.toList())
			.stream().min((i,j)->(i.compareTo(j)));



return max.get();
	}
	

}

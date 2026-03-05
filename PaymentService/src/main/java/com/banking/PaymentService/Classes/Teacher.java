package com.banking.PaymentService.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	
	@Autowired
	@Qualifier(value="Aditi")
	public I_Student student;
	
	public void checkDance()
	{
	     student.dance();
	     student.greet();
	}
}

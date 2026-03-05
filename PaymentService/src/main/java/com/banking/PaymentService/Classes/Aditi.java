package com.banking.PaymentService.Classes;

import org.springframework.stereotype.Component;

@Component(value="Aditi")
public class Aditi implements  I_Student  {

	@Override
	public void greet() {
		System.out.println("Good Afternoon!");
		
	}

	@Override
	public void dance() {
		System.out.println("Break Dance!");
		
	}

}

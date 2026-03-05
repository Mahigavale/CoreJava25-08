package com.banking.PaymentService.Classes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Priyanka implements I_Student {

	@Override
	public void greet() {
		System.out.println("PS");
		System.out.println("Good Morning!!!!");
		
	}

	
	public void dance() {
		System.out.println("Kathakalii");
		
	}

}

package com.Demo.user_input.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	
	@PostMapping("/add")
	public String addname(@RequestParam(value="nm") String name,@RequestParam(value="ln") String lastname)
	{
		
		System.out.println(name+"::::"+lastname);
		System.out.println("hello");
		return name+"**********"+lastname;
		
	}
}

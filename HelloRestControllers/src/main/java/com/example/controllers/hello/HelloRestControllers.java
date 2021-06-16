package com.example.controllers.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestControllers {
	
	@RequestMapping(value = {"","/","/home"})
	public static String sayHello() {
		return "Hello From Bridgelabz!!";
	}

}

package com.example.controllers.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Controller
public class HelloWebControllers {
	
	//UC-1
	@RequestMapping(value = {"","/","/home"})
	public static String sayHello() {
		return "Hello From Bridgelabz!!";
	}
	
	
	@GetMapping("/web")
	public String hello() {
		return "hello";
	}

}

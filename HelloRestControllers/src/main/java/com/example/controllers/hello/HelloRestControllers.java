package com.example.controllers.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestControllers {
	
	/*UC-1  (command: curl -X GET "http://localhost:8080/hello" -w "\n")
	        (url:     http://localhost:8080/hello) */
	
	@RequestMapping(value = {"","/","/home"})
	public static String sayHello() {
		return "Hello From Bridgelabz!!";
	}
	
	/* UC-2  (command: curl "http://localhost:8080/hello/query?name=Megha" -w "\n")
	         (url:     http://localhost:8080/hello/query?name=Megha) */
	
	@RequestMapping(value = {"/query"}, method = RequestMethod.GET)
	public String sayHello(@RequestParam(value="name")String name) {
		return "Hello " + name + " !!";
	}

	/* UC-3 (command: curl  "http://localhost:8080/hello/param/Megha" -w "\n" )
	        (url:     http://localhost:8080/hello/param/Megha ) */
	
	@GetMapping ("/param/{name}")
	public String sayHelloParam(@PathVariable String name) {
		return "Hello " + name + " !!"; 
	}
}
 
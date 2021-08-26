package com.faith.app.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${coach.name}")
	private String coachName;
	
	// expose "/" to get response
	@GetMapping("/")
	public String sayHello() {
		return " Hello Guys!" + coachName + "  Time on server is " + LocalDateTime.now();
	}
	
	//@RequestMapping("/")
	public String index() {
		return "Greetings from Faith Info Tech...:: CI/CD Integration";
	}
	
	

}

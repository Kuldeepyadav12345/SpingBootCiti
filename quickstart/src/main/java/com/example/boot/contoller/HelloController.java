package com.example.boot.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@RequestMapping("/hello")
public String sayhello()
	{
	return "Welcome to spring boot";
	}
	
}

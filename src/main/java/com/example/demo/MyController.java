package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/hello")
	public String letc() {
		
		return "hello world how are you";
	}
	
	
}

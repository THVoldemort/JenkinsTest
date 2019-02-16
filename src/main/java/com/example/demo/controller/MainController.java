package com.example.demo.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@RestController
public class MainController {
	
	@GetMapping("/")
	public String welcome() {
		return "Branch kien.do Welcome to Jenkins test!";
	}
}

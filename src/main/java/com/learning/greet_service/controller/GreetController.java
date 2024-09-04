package com.learning.greet_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.greet_service.constants.AppConstants;

@RestController
public class GreetController {
	
	@GetMapping("/")
	public String greetMsg() {
		return AppConstants.GREET_MSG;
	}
}

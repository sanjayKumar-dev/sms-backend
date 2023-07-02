package com.sms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sms")
public class controller {
	
	@GetMapping("/welcome")
	public String welcomeCalss() {
		return "Welcome to SMS (School Management System)";
	}

}

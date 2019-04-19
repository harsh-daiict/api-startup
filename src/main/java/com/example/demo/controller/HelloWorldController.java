package com.example.demo.controller;

import javax.annotation.security.RolesAllowed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RolesAllowed("ROLE_ANONYMOUS")
public class HelloWorldController {
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}

}

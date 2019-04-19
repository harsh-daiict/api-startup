package com.example.demo.controller;

import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.response.Response;

@RestController
@RequestMapping(value="/login")
public class LoginController {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON)
    public @ResponseBody Response login() {
		return Response.empty();
    }
	
	
}

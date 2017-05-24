package com.erisohv.testingapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestingApplicationController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(){
		return "index.html";
	}

}

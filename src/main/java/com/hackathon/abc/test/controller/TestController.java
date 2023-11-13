package com.hackathon.abc.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hackathon.abc.test.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	TestService service;
	
	@GetMapping("/test")
	public ModelAndView test() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("testDto", service.testSelect());
		mav.setViewName("test");
		return mav;
		
	}
	
}

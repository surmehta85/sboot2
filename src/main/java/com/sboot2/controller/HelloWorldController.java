package com.sboot2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String getHello() {
		return "Hi surendra, good u r learning  git";
	}

}

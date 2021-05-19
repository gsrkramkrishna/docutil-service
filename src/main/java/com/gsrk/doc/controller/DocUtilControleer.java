package com.gsrk.doc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class DocUtilControleer {
	
	
	@GetMapping("/hello")
	public String hello() {
		return "Hi";
	}

}

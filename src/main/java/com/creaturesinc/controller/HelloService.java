package com.creaturesinc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

	@GetMapping("/hello")
	String getHello() {
		return "Hello World 2";
	}
	
}

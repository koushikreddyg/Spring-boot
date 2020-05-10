package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

	@GetMapping("/hi")
	public String index() {
		return "Hello World";
	}

}

package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PostController{
	@PostMapping("/post/{id}")
	public Details index(@RequestBody Details details, HttpServletResponse response, HttpServletRequest request, @PathVariable String id ) {
		System.out.println(id);
		details.age = id;
		response.setStatus(200);
		
		return details;
		
	}

}



package com.example.demo.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetController {

	@GetMapping("/hi")
	public ResponseEntity<String> index() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity(new Posts(), headers);
		RestTemplate template = new RestTemplate();
		try {
			ResponseEntity<String> en = template.exchange("https://jsonplaceholder.typicode.com/post/1", HttpMethod.PUT,
					entity, String.class);
			String body = en.getBody();
			HttpStatus statusCode = en.getStatusCode();
			return ResponseEntity.status(statusCode).body(body);
		} catch (HttpStatusCodeException e) {
			return ResponseEntity.status(e.getStatusCode()).body(e.getResponseBodyAsString());
		}

	}

}

class Posts {

	public String title = "foo";
	public String body = "bar";
	public int userId = 1;

}

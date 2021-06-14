package com.training.test.project.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/project")
public class TestApi {

	
	@GetMapping("/")
	public ResponseEntity<?> testGetMethod(){
		
		return ResponseEntity.ok("Get Mapping is working fine");
	}
}

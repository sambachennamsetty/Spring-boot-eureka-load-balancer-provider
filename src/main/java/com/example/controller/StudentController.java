package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student-provider")
public class StudentController {

	@Value("${server.port}")
	private String port;
	
	@GetMapping("/get")
	public String getStudentData() {
		return "This is from student provider with Port:"+port;
	}
}

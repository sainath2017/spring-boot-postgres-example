package com.wfs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wfs.dto.StudentDto;
import com.wfs.model.Student;
import com.wfs.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping(value = "/hello/{world}")
	public ResponseEntity<String> sayHello(@PathVariable String world) {
		String hello = studentService.sayHello(world);
		return new ResponseEntity<>(hello, HttpStatus.OK);
	}
	
	@PostMapping(value = "/create-student")
	public ResponseEntity<Student> createStudent(@RequestBody StudentDto student) {
		return new ResponseEntity<>(studentService.createStudent(student), HttpStatus.OK);
	}
	
	@GetMapping(value = "/") 
	public ResponseEntity<List<StudentDto>> getStudents() {
		return new ResponseEntity<>(studentService.getStudents(), HttpStatus.CREATED);
	}

}

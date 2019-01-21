package com.wfs.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfs.dao.StudentDao;
import com.wfs.dto.StudentDto;
import com.wfs.mapper.StudentMapper;
import com.wfs.model.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private StudentMapper mapper;
	
	public String sayHello(String world) {
		return "Hello " + world;
	}
	
	public Student createStudent(StudentDto dto) {
		Student student = mapper.toModel(dto);
		return studentDao.save(student);
	}

	public List<StudentDto> getStudents() {
		Iterable<Student> studentList = studentDao.findAll();
		return StreamSupport.stream(studentList.spliterator(), true)
				.map(mapper::toDto).collect(Collectors.toList());
	}

}

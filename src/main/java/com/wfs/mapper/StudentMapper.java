package com.wfs.mapper;

import org.mapstruct.Mapper;

import com.wfs.dto.StudentDto;
import com.wfs.model.Student;

@Mapper(componentModel = "spring")
public interface StudentMapper {
	StudentDto toDto(Student student);
	Student toModel(StudentDto dto);
}

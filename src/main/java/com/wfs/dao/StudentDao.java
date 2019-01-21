package com.wfs.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wfs.model.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Long>{

}

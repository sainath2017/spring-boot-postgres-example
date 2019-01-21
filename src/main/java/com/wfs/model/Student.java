package com.wfs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id_sequence")
	@SequenceGenerator(name = "student_id_sequence", sequenceName = "student_id_sequence", allocationSize = 1)
	private long id;
	private String name;

}

package com.wfs.dto;

public class StudentDto {
	
	private long id;
	private String name;
	
	public StudentDto(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public StudentDto() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

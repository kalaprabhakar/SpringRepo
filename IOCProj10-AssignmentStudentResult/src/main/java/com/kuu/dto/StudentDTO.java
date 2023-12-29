package com.kuu.dto;

import java.io.Serializable;

public class StudentDTO  implements Serializable{
	
	private String name;
	private String course;
	private String address;
	private Integer mark1;
	private Integer mark2;
	private Integer mark3;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getMark1() {
		return mark1;
	}
	public void setMark1(Integer mark1) {
		this.mark1 = mark1;
	}
	public Integer getMark2() {
		return mark2;
	}
	public void setMark2(Integer mark2) {
		this.mark2 = mark2;
	}
	public Integer getMark3() {
		return mark3;
	}
	public void setMark3(Integer mark3) {
		this.mark3 = mark3;
	}
	
	
	
	

}

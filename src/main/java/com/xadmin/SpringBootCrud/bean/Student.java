package com.xadmin.SpringBootCrud.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	private String id;
	private String name;
	private String age;
	private String address;
	
	public Student() {
		super();
	}
	public Student(String id, String name, String age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}

package com.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student 
{
	@Id
	private int rollno;
	private String name;
	@ManyToMany(cascade=CascadeType.ALL)
	Set<Course>c=new HashSet<>();
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Course> getC() {
		return c;
	}
	public void setC(Set<Course> c) {
		this.c = c;
	}

}

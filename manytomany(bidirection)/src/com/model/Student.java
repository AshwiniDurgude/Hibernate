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
	private String sname;
	@ManyToMany(cascade=CascadeType.ALL)
	Set<Course> c=new HashSet<>();
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Set<Course> getC() {
		return c;
	}
	public void setC(Set<Course> c) {
		this.c = c;
	}
	

}

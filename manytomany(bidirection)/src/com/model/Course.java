package com.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Course 
{
	@Id
	private int cid;
	private String cname;
	@ManyToMany(cascade=CascadeType.ALL)
	Set<Student> s=new HashSet<>();
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Set<Student> getS() {
		return s;
	}
	public void setS(Set<Student> s) {
		this.s = s;
	}

	
}

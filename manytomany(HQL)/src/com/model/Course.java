package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course
{
	@Id
	private int cid;
	private String Cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	

}

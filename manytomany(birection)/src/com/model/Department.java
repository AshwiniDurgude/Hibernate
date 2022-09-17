package com.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department 
{
	@Id
	private int deptId;
	private String deptName;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "d")
	private Set<Employee> e=new HashSet<>();
	public Set<Employee> getE() {
		return e;
	}
	public void setE(Set<Employee> e) {
		this.e = e;
	}
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}

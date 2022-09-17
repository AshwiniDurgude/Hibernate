package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employee 
{
	@Id
	private int empId;
	private String empName;
	@ManyToOne(cascade=CascadeType.ALL)
	private Department d;
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

}

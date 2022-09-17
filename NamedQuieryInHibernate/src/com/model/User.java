package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@NamedQueries({
@NamedQuery(name="User.FindByAll",query="from User"),
@NamedQuery(name="User.FindByUid",query="from User where uid=?"),
@NamedQuery(name="User.DeleteData",query="delete from User where uid=?"),
@NamedQuery(name="User.UpdateData",query="update User set name='Ashu' where uid=2")
})
@Entity
public class User
{
	@Id
	private int uid;
	private String name;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@NamedNativeQueries({
@NamedNativeQuery(name="User.InsertData",query="insert into user values(?,?)",resultClass=User.class),
@NamedNativeQuery(name="User.FindAllData",query="select * from user",resultClass=User.class),
@NamedNativeQuery(name="User.FindSingle",query="select * from user where uid=?",resultClass=User.class),
@NamedNativeQuery(name="User.Delete",query="delete from user where uid=?",resultClass=User.class),
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

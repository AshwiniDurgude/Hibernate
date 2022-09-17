package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.model.Department;
import com.model.Employee;

public class Test 
{
	public static void main(String[] args) 
	{
		Session session =HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Department d=new Department();
		d.setDeptId(1);
		d.setDeptName("ST");
		
		Employee e1=new Employee();
		e1.setEmpId(1);
		e1.setEmpName("A");
		
		Employee e2=new Employee();
		e2.setEmpId(2);
		e2.setEmpName("B");
		
		e1.setD(d);
		e2.setD(d);
		
		d.getE().add(e1);
		d.getE().add(e2);

		
		 session.save(e1);
		 session.save(e2);

		 tx.commit();
		
	}
	

}

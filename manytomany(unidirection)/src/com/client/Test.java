package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.model.Course;

import com.model.Student;

public class Test 
{
	public static void main(String[] args) 
	{
		Session session =HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		Student s=new Student();
		s.setRollno(1);
		s.setSname("Abc");
		
		Student s1=new Student();
		s1.setRollno(2);
		s1.setSname("Pqr");
		
		Student s2=new Student();
		s2.setRollno(3);
		s2.setSname("Xyz");
		
		Course c1=new Course();
		c1.setCid(101);
		c1.setCname("Java");
		
		Course c2=new Course();
		c2.setCid(102);
		c2.setCname("Python");
		
		Course c3=new Course();
		c3.setCid(103);
		c3.setCname("Angular");
		
		s.getC().add(c1);
		s.getC().add(c3);
		s.getC().add(c2);
		
		s1.getC().add(c3);
		s1.getC().add(c1);
		
		s2.getC().add(c2);
		s2.getC().add(c1);
		s2.getC().add(c3);
		
		 session.save(s);
		 session.save(s1);
		 session.save(s2);

		 tx.commit();
		
	}
	

}

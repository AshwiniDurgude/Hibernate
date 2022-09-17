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
		s.setName("ABC");
		
		Student s1=new Student();
		s1.setRollno(2);
		s1.setName("PQR");
		
		Student s2=new Student();
		s2.setRollno(3);
		s2.setName("XYZ");
		
		Course c=new Course();
		c.setcId(101);
		c.setcName("JAVA");
		
		Course c1=new Course();
		c1.setcId(102);
		c1.setcName("PYTHON");
		
		Course c2=new Course();
		c2.setcId(103);
		c2.setcName("ANGULAR");
		
		s.getC().add(c);
		s.getC().add(c1);
		
		s1.getC().add(c2);
		s1.getC().add(c1);
		s1.getC().add(c);
		
		s2.getC().add(c2);
		s2.getC().add(c1);
		
		 session.save(s);
		 session.save(s1);
		 session.save(s2);

		 tx.commit();
		
	}
	

}

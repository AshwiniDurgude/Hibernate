package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.config.HibernateUtil;
import com.model.Course;
import com.model.Student;

public class UpdateDataHql 
{
	public static void main(String[] args)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
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
		
		 session.save(s);
		 session.save(s1);
		 session.save(s2);
		 
		 session.save(c1);
		 session.save(c2);
		 session.save(c3);
		
		String hql="update Student set sname='Ashu' where rollno=1";
		Query<Student> q=session.createQuery(hql);
		q.executeUpdate();
		
		
		tx.commit();
	}

}

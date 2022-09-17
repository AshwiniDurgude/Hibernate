package com.client;

	import java.util.List;
	import org.hibernate.Session;
	import org.hibernate.Transaction;
	import org.hibernate.query.Query;

	import com.config.HibernateUtil;
	import com.model.Course;
	import com.model.Student;

	public class RetriveDataHql
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
			
			 session.save(s);
			 session.save(s1);
			 session.save(s2);
			 
			 session.save(c1);
			 session.save(c2);
			 session.save(c3);
			String hql="from Student";
			String hql1="from Course";

			Query<Student> q=session.createQuery(hql);
			Query<Course> q1=session.createQuery(hql1);

			
			List<Student> list=q.getResultList();
			List<Course> list1=q1.getResultList();

			for(Course course:list1)
			{
				System.out.println(course.getCid());
				System.out.println(course.getCname());
			}

			
			for(Student student:list)
			{
				System.out.println(student.getRollno());
				System.out.println(student.getSname());
			}
			
			
					 tx.commit();
			
		}
		

	}




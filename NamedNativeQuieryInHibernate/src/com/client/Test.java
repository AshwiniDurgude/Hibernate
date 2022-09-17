package com.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.config.HibernateUtil;
import com.model.User;

public class Test {

	public static void main(String[] args)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		System.out.println("*****Insert Data*****");
		Query<User> query = session.getNamedNativeQuery("User.InsertData");
		query.setParameter(0, 10);
		query.setParameter(1, "zzz");
		session.getTransaction().begin();
		query.executeUpdate();
		session.getTransaction().commit();
		System.out.println("");
		
		System.out.println("*****Find All Data*****");
		Query<User> query1=session.getNamedNativeQuery("User.FindAllData");
		List<User> list=query1.getResultList();
		for(User u:list) 
		{
			System.out.println(u.getUid());
			System.out.println(u.getName());
		}
		System.out.println("");

		System.out.println("*****Find Single Data*****");
		Query<User> query2=session.getNamedNativeQuery("User.FindSingle");
		query2.setParameter(0,1);
		User u1=query2.getSingleResult();
		System.out.println(u1.getUid());
		System.out.println(u1.getName());
		System.out.println("");

		System.out.println("*****Delete Data*****");
		Query<User> query3=session.getNamedNativeQuery("User.Delete");
		query3.setParameter(0,10);
		
		session.getTransaction().begin();
		query3.executeUpdate();
		session.getTransaction().commit();
		System.out.println("");

		System.out.println("*****Find All Data*****");
		Query<User> query4=session.getNamedNativeQuery("User.FindAllData");
		List<User> list2=query1.getResultList();
		for(User u2:list2) 
		{
			System.out.println(u2.getUid());
			System.out.println(u2.getName());
		}
		}
	}




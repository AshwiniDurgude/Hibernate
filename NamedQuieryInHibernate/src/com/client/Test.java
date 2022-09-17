package com.client;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.config.HibernateUtil;
import com.model.User;

public class Test {

	public static void main(String[] args)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		System.out.println("*****Find All Data*****");
		Query<User> query=session.getNamedQuery("User.FindByAll");
		List<User> list=query.getResultList();
		for(User u:list)
		{
			System.out.println(u.getUid());
			System.out.println(u.getName());
		}
		
		System.out.println("*****Find Single Data*****");
		Query<User> query1=session.getNamedQuery("User.FindByUid");
		query1.setParameter(0,3);
		User u1=query1.getSingleResult();
		
		System.out.println(u1.getUid());
		System.out.println(u1.getName());
			
		System.out.println("*****Delete Data*****");
		Query<User> query2=session.getNamedQuery("User.DeleteData");
		query2.setParameter(0,1);
		
		session.getTransaction().begin();
		query2.executeUpdate();
		session.getTransaction().commit();
		
		System.out.println("*****Find Update Data*****");
		Query<User> query3=session.getNamedQuery("User.UpdateData");
		//query3.setParameter(0, 2);
		//query3.setParameter(0, "Ashu");
		session.getTransaction().begin();
		query3.executeUpdate();
		session.getTransaction().commit();
		}
	}



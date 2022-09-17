package com.config;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.model.Department;
import com.model.Employee;

public class HibernateUtil 
{
	static StandardServiceRegistry registry=null;
	static SessionFactory sf=null;
	public static SessionFactory getSessionFactory()
	{
		try
		{
			if(sf==null)
			{
				Map<String, Object> maps=new HashMap<String,Object>();
				//connection property
				maps.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
				maps.put(Environment.URL, "jdbc:mysql://localhost:3306/many2one");
				maps.put(Environment.USER, "root");
				maps.put(Environment.PASS, "root");

				//Hibernate property
				maps.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				maps.put(Environment.HBM2DDL_AUTO, "update");
				maps.put(Environment.SHOW_SQL, "true");
				
				registry=new StandardServiceRegistryBuilder().applySettings(maps).build();
				MetadataSources mds=new MetadataSources(registry);
				mds.addAnnotatedClass(Employee.class);
				mds.addAnnotatedClass(Department.class);

				Metadata md=mds.getMetadataBuilder().build();
				sf=md.getSessionFactoryBuilder().build();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return sf;
		
	}
}
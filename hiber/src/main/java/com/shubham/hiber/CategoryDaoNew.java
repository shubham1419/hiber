package com.shubham.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class CategoryDaoNew {
	
	Configuration config = new Configuration().configure().addAnnotatedClass(Category.class);
	private SessionFactory sessionfactory = config.buildSessionFactory();

	public void addCategory(Category cat)
	{
		System.out.println("in add category" +cat);
		Session session = sessionfactory.getCurrentSession();
		session.save(cat);
		System.out.println("in add category" +cat);
	}
}

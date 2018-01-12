package com.shubham.hiber;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {
    @Autowired
	private SessionFactory sessionFactory;
	private static Configuration config;
	private static List<Category> categories = new ArrayList<>();
	/*
	static {
		Category cat = new Category();
		/*1 product*/
		/*cat.setId(1);
		cat.setName("Mobile");
		cat.setDescription("This is descrition for mobile");
		cat.setImage_url("mobile_1.png");
		
		categories.add(cat);
		
		/*2 product*/
		/*cat = new Category();
		cat.setId(1);
		cat.setName("Laptop");
		cat.setDescription("This is descrition for laptop");
		cat.setImage_url("laptop_1.png");
		
		categories.add(cat);
	}*/
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	@Transactional
	public boolean add(Category category) {
		try {

			Session session = sessionFactory.getCurrentSession();
			session.save(category);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
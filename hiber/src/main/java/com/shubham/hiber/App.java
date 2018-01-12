package com.shubham.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	//@Autowired
	//private static SessionFactory sessionFactory;
	/*@Autowired
	CategoryDao categoryDaoBean;
	
	public static void main(String ar[])
	{
		//new App().data();
	}
	
/*	public void data()
	{
		CategoryDao dao = new CategoryDaoImpl();		
	Category category = new Category();
	//category.setName("Mobiless");
	///*category.setDescription("This is descrition for mobilemm");
	category.setImage_url("mobile_2.png");
	
	//System.out.println(category.getName());
	
	/*for(Category cat : category)
	{
		
	}*/
//	//dao.add(category);
	
	//}	
	
	@Autowired
	CategoryDaoNew dao;
	
	public static void main(String ar[])
	{
		ApplicationContext con = new AnnotationConfigApplicationContext(HiberConfig.class);

		CategoryDaoNew dao2 = (CategoryDaoNew)con.getBean(CategoryDaoNew.class);
		
		//CategoryDaoNew dao2 = new CategoryDaoNew();
		int id =4;
		String name= "lapto";
		String description = "dghfghfghghc";
		String image = "lap_1.png";
		Boolean active = true;
		Category cat = new Category(id,name,description,image,active);
		
		dao2.addCategory(cat);
		//dao.addCategory(cat);
	}
	
	
	
	
}

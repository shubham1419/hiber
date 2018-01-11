package com.shubham.hiber;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Hello world!
 *
 */
public class App 
{
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
		CategoryDaoNew dao2 = new CategoryDaoNew();
		int id =3;
		String name= "laptopp";
		String description = "desc";
		String image = "lap_1.png";
		Boolean active = true;
		Category cat = new Category(id,name,description,image,active);
		dao2.addCategory(cat);
		//dao.addCategory(cat);
	}
	
	
	
	
}

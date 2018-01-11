package com.shubham.hiber;

import org.springframework.beans.factory.annotation.Autowired;

public class Check {
	
	
	@Autowired
	static CategoryDaoNew dao;
	CategoryDaoNew dao2 = new CategoryDaoNew(); 
	
	public static void main(String ar[])
	{
		int id =1;
		String name= "laptop";
		String description = "desc";
		String image = "lap_1.png";
		Boolean active = true;
		Category cat = new Category(id,name,description,image,active);
		dao.addCategory(cat);
	}
	

}

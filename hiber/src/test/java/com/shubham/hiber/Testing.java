/*package com.shubham.hiber;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {

	@Autowired
	private static CategoryDao categoryDaoBean;
	
	private static CategoryDao categoryDao;
	
	private static AnnotationConfigApplicationContext context;
	
	private Category category;
	
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.shubham.hiber");
		context.refresh();
		categoryDao = (CategoryDao)context.getBean("categoryDao");
		//CategoryDaoImpl cat = new CategoryDaoImpl();
		//categoryDao = cat;	
	}

	@Test
	public void testAddCategory()
	{
		category = new Category();
		category.setName("Mobile");
		category.setDescription("This is descrition for mobile");
		category.setImage_url("mobile_1.png");
		
		assertEquals("Successfully inserted the category",true,categoryDao.add(category));
	}
	
}

*/
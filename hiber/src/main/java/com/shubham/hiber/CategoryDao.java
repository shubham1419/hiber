package com.shubham.hiber;

import java.util.List;


public interface CategoryDao {
	List<Category> list();
	boolean add(Category category);

}

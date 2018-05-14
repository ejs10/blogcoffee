package com.blog.coffee.dao;

import com.blog.coffee.User;

public interface UserDao {
	
	//login
	public User userLogin(User user);
		
	//login id check
	public User loginIdcheck(User user);
	
	

}

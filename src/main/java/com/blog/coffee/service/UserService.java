package com.blog.coffee.service;

import com.blog.coffee.User;

public interface UserService {
	
	//login
	public User userLogin(User user);
	
	//login id check
	public User loginIdcheck(User user);
	

}

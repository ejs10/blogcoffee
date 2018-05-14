package com.blog.coffee.mappers;

import com.blog.coffee.User;

public interface UserMapper {
	
	//login
	public User userLogin(User user);
	
	//login id check
	public User loginIdcheck(User user);
	
	
	
}

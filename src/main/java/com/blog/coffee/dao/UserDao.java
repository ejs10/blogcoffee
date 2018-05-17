package com.blog.coffee.dao;


import com.blog.coffee.User;

public interface UserDao {
	
	//회원가입
	public int userJoin(User user);
	
	
	//login
	public User userLogin(User user);
		
	//login id check
	public User loginIdcheck(User user);
	
	

}

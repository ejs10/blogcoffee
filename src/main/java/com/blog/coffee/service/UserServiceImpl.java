package com.blog.coffee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.coffee.User;
import com.blog.coffee.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User userLogin(User user) {
		return userDao.userLogin(user);
	}

	@Override
	public User loginIdcheck(User user) {
		return userDao.loginIdcheck(user);
	}

}

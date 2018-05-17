package com.blog.coffee.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.coffee.User;
import com.blog.coffee.mappers.UserMapper;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	SqlSession session;

	//회원가입
	@Override
	public int userJoin(User user) {
		return session.getMapper(UserMapper.class).userJoin(user);
	}

	//로그인
	@Override
	public User userLogin(User user) {
		return session.getMapper(UserMapper.class).userLogin(user);
	}

	//로그인아이디체크
	@Override
	public User loginIdcheck(User user) {
		return session.getMapper(UserMapper.class).loginIdcheck(user);
	}


}

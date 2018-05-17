package com.blog.coffee.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blog.coffee.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//회원가입 출력
	@RequestMapping(value = "/join", method=RequestMethod.GET)
	public String join() {
		return "user/join";
	}
	
	//회원가입
	
	
	//로그인페이지
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String login() {
		return "/user/login";
	}

}

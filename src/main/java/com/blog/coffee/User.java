package com.blog.coffee;

import java.util.Date;

public class User {
	private String userId; //유저아이디
	private String userPw; //유저비번
	private String userName; //유저이름
	private String userSname; //닉네임
	private String userEmail; //이메일
	private int userLevel; //유저레벨
	private Date regDate; //가입일
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSname() {
		return userSname;
	}
	public void setUserSname(String userSname) {
		this.userSname = userSname;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	

}

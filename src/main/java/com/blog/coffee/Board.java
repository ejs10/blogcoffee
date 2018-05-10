package com.blog.coffee;

import java.util.Date;

public class Board {
	private int bdNum;
	private String bdTitle;
	private String bdContent;
	private String bWriter;
	private String userSname;
	private Date bregDate;

	public int getBdNum() {
		return bdNum;
	}
	public void setBdNum(int bdNum) {
		this.bdNum = bdNum;
	}
	public String getBdTitle() {
		return bdTitle;
	}
	public void setBdTitle(String bdTitle) {
		this.bdTitle = bdTitle;
	}
	public String getBdContent() {
		return bdContent;
	}
	public void setBdContent(String bdContent) {
		this.bdContent = bdContent;
	}
	public String getbWriter() {
		return bWriter;
	}
	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}
	public String getUserSname() {
		return userSname;
	}
	public void setUserSname(String userSname) {
		this.userSname = userSname;
	}
	public Date getBregDate() {
		return bregDate;
	}
	public void setBregDate(Date bregDate) {
		this.bregDate = bregDate;
	}
	
}

package com.blog.coffee.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class BoardController {
	
	//게시판 작성페이지 출력
	@RequestMapping(value="/board/boardInsert", method=RequestMethod.GET)
	public String boardInset() {
		
		return "board/boardInsert";
	}
	
	//게시판 입력 action
	
	
	//게시판 목록페이지 출력
	
	
	//게시판목록 action
	
	
	//게시판 수정
	
	
	//게시판 삭제
	
	

}

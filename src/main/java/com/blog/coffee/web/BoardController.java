package com.blog.coffee.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blog.coffee.Board;
import com.blog.coffee.service.BoardService;

@Controller
@RequestMapping("/")
public class BoardController {
	
	
	@Autowired
	private BoardService boardService;
	
	//게시판 작성페이지 출력
	@RequestMapping(value="/board/boardInsert", method=RequestMethod.GET)
	public String boardInsert(Board board) {
		
		return "board/boardInsert";
	}
	
	//게시판 입력 action
	@RequestMapping(value = "/board/boardInsert", method = RequestMethod.POST)
	public String boardInsertAction(Board board, Model model) {
		boardService.boardInsert(board);
		model.addAttribute("boardList", boardService.boardList());
		return "board/boardList";
	}
	
	
	//게시판 목록페이지 출력
	
	
	//게시판목록 action
	
	
	//게시판 수정
	
	
	//게시판 삭제
	
	

}

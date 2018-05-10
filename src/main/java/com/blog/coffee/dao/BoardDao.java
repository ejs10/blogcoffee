package com.blog.coffee.dao;

import java.util.List;

import com.blog.coffee.Board;

public interface BoardDao {
	//게시글 작성
	public void boardInsert(Board board);
	//게시글 목록
	public List<Board> boardList();
	//게시글 내용
	public Board boardRead(int bdNum);
	//게시글 수정
	public void boardUpdate(Board board);
	//게시글 삭제
	public void boardDelete(int bdNum);
	

}

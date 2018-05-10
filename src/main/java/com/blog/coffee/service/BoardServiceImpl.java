package com.blog.coffee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.coffee.Board;
import com.blog.coffee.dao.BoardDao;

@Service
public class BoardServiceImpl implements BoardService{
	
	//boardDao 가져오기
	@Autowired
	private BoardDao boardDao;

	//게시글 작성
	@Override
	public void boardInsert(Board board) {
		boardDao.boardInsert(board);
	}

	//게시글 목록
	@Override
	public List<Board> boardList() {
		return boardDao.boardList();
	}

	//게시글 읽기
	@Override
	public Board boardRead(int bdNum) {
		return boardDao.boardRead(bdNum);
	}

	//게시글 수정
	@Override
	public void boardUpdate(Board board) {
		boardDao.boardUpdate(board);
	}

	//게시글 삭제
	@Override
	public void boardDelete(int bdNum) {
		boardDao.boardDelete(bdNum);
	}

}

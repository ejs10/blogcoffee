package com.blog.coffee.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.coffee.Board;
import com.blog.coffee.mappers.BoardMapper;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	//sqlsession 값 가져오기
	@Autowired
	private SqlSession session;

	//게시글 작성
	@Override
	public void boardInsert(Board board) {
		session.getMapper(BoardMapper.class).boardInsert(board);
	}

	//게시글 목록
	@Override
	public List<Board> boardList() {
		return session.getMapper(BoardMapper.class).boardList();
	}

	//게시글 읽기
	@Override
	public Board boardRead(int bdNum) {
		return session.getMapper(BoardMapper.class).boardRead(bdNum);
	}

	//게시글 수정
	@Override
	public void boardUpdate(Board board) {
		session.getMapper(BoardMapper.class).boardUpdate(board);
	}

	//게시글 삭제
	@Override
	public void boardDelete(int bdNum) {
		session.getMapper(BoardMapper.class).boardDelete(bdNum);
	}

}

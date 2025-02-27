package com.simple.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.simple.board.BoardVO;
import com.simple.util.SqlSessionFactoryBean;

@Repository
public class BoardDAOMybatis {
	
	private SqlSession mybatis;
	
	public BoardDAOMybatis() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	public void insertBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.insertBoard", vo);
		mybatis.commit();
	}

	public void updateBoard(BoardVO vo) {
		mybatis.update("BoardDAO.updateBoard", vo);
		mybatis.commit();
	}

	public void deleteBoard(BoardVO vo) {
		mybatis.delete("BoardDAO.deleteBoard", vo);
		mybatis.commit();
	}

	public BoardVO getBoard(BoardVO vo) {
		return (BoardVO)mybatis.selectOne("BoardDAO.getBoard", vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		return mybatis.selectList("BoardDAO.getBoardList", vo);
	}
	
	

}

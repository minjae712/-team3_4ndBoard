package com.springbook.biz.board.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

//DAO(Data Access Object)
@Repository
public class BoardDAO {
	
	@PersistenceContext
	private EntityManager em;
		
	// 글 등록
	public void insertBoard(BoardVO vo) {
		em.persist(vo);
	}
	
	// 글 수정
	public void updateBoard(BoardVO vo) {
		em.merge(vo);
	}

	// 글 삭제
	public void deleteBoard(BoardVO vo) {
		em.remove(em.find(BoardVO.class, vo.getSeq()));
	
	}
	
	public BoardVO getBoard(BoardVO vo) {
		return (BoardVO) em.find(BoardVO.class, vo.getSeq());
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {	
		return em.createQuery("from BoardVO b order by b.seq desc").getResultList();
	}	
}

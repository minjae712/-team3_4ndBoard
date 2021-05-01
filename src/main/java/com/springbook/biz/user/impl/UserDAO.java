package com.springbook.biz.user.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.springbook.biz.user.UserVO;

@Repository
public class UserDAO {

	@PersistenceContext
	private EntityManager em;

	public UserVO getUser(UserVO vo) {	
		return (UserVO) em.find(UserVO.class, vo.getId());

    }

	public void createUser(UserVO vo) {
		System.out.println("유저 저장~");
		em.persist(vo);
	}
	
	public void changePassword(UserVO vo) {
		UserVO user = em.find(UserVO.class, vo.getId());
		user.setPassword(vo.getPassword());
		em.merge(user);				
	}
}

package com.springbook.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springbook.biz.user.UserVO;

@Transactional
@Service
public class UserServiceImpl {
	
	@Autowired
	private UserDAO userDAO;
	
	
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
	
	public void createUser(UserVO vo) {
		System.out.println("회원가입 비지니스 기능");
		userDAO.createUser(vo);
	}
	
	public void changePassword(UserVO vo) {
		userDAO.changePassword(vo);
	}
}

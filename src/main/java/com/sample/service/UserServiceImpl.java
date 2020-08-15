package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sample.dao.UserDao;
import com.sample.web.view.User;

@Transactional
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public void addUser(User user) {
		userDao.insertUser(user);
		userDao.insertUserSub(user);
		userDao.insertUserAddr(user);
		
	}

	@Override
	public User loginUser(String id, String password) {
		User user = userDao.getUserById(id);
		if (user == null) {
			return null;
		}
		if (!user.getPassword().equals(password)) {
			return null;
			
		}
		
		return user;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserDetail(String id) {
		return userDao.getUserById(id);
	}
	
	

}
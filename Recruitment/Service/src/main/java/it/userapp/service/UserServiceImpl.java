package it.userapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.userapp.dao.UserDao;
import it.userapp.entity.User;

import org.springframework.stereotype.Component;

 
@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserDao userDao;
	
	
	public UserServiceImpl() {
	
	}
	
	
	@Transactional
	public List<User> findAll() {
		return userDao.findAll();
	}


	@Transactional
	public void addUser(User user) {
		userDao.addUser(user);
	}

}

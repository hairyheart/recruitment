package it.userapp.dao;

import java.util.List;


import it.userapp.entity.User;

public interface UserDao {

	public void addUser(User user);
	public List<User> findAll();
	
	
}

package it.userapp.service;

import java.util.List;

import it.userapp.entity.User;

public interface UserService {
	public List<User> findAll();
	public void addUser(User user);
	

}

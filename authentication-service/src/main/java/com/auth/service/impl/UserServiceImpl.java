package com.auth.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.dao.UsersDAO;
import com.auth.entity.Users;
import com.auth.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersDAO userDAO;

	@Override
	public Users createUser(Users user) {
		// TODO Auto-generated method stub
		return userDAO.createUser(user);
	}

	@Override
	public Users getUser(int id) {
		// TODO Auto-generated method stub
		return userDAO.getUser(id);
	}

	@Override
	public Users updateUser(Users user) {
		// TODO Auto-generated method stub
		return userDAO.updateUser(user);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userDAO.deleteUser(id);
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return userDAO.getAllUsers();
	}

	public long getMaxId() {
		long val = userDAO.getMaxId();
		if ( val <= 0 ) {
			return 1;
		} 
		return val;
	}

}

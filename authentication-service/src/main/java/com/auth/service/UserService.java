package com.auth.service;

import java.util.List;

import com.auth.entity.Users;

public interface UserService {
	public Users createUser(Users user);

	public Users getUser(int id);
	
	public Users updateUser(Users employee);

	public void deleteUser(int id);

	public List<Users> getAllUsers();
	
	public long getMaxId();

}

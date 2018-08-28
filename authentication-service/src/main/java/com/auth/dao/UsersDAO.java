package com.auth.dao;

import java.util.List;

import com.auth.entity.Users;

public interface UsersDAO {

	public Users createUser(Users user);

	/**
	 * Getting the Employee Information using Id
	 * 
	 * @param id
	 * @return {@link Employee}
	 */
	public Users getUser(int id);

	/**
	 * Used to Update the Employee Information
	 * 
	 * @param employee
	 * @return {@link Employee}
	 */

	public Users updateUser(Users user);

	/**
	 * Deleting the Employee Information using Id
	 * 
	 * @param id
	 */
	public void deleteUser(int id);
	
	
	/**
	 * Getting the All Userinformation
	 * 
	 * @return
	 */
	public List<Users> getAllUsers();
	
	public long getMaxId();
}

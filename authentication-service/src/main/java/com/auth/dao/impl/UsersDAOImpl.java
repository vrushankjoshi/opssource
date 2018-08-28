package com.auth.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.auth.dao.UsersDAO;
import com.auth.entity.Users;
import com.auth.util.MyCassandraTemplate;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select.Selection;

@Repository
public class UsersDAOImpl implements UsersDAO {

	@Autowired
	private MyCassandraTemplate myCassandraTemplate;

	@Override
	public Users createUser(Users user) {
		// TODO Auto-generated method stub
		return myCassandraTemplate.create(user);
	}

	@Override
	public Users getUser(int id) {
		// TODO Auto-generated method stub
		return myCassandraTemplate.findById(id, Users.class);
	}

	@Override
	public Users updateUser(Users user) {
		// TODO Auto-generated method stub
		return myCassandraTemplate.update(user, Users.class);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		myCassandraTemplate.deleteById(id, Users.class);
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return myCassandraTemplate.findAll(Users.class);
	}

	public long getMaxId() {
		return myCassandraTemplate.getMaxValue("users", "id");
	}
}

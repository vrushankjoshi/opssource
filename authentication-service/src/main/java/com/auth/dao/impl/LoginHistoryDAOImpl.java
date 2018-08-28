package com.auth.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.auth.dao.LoginHistoryDAO;
import com.auth.entity.LoginHistory;
import com.auth.util.MyCassandraTemplate;

@Repository
public class LoginHistoryDAOImpl implements LoginHistoryDAO {

	@Autowired
	private MyCassandraTemplate myCassandraTemplate;

	@Override
	public LoginHistory createLoginHistory(LoginHistory history) {
		// TODO Auto-generated method stub
		return myCassandraTemplate.create(history);
	}
	public long getMaxId() {
		return myCassandraTemplate.getMaxValue("login_history", "historyid");
	}

		
}

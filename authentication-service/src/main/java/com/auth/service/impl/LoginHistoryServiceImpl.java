package com.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.dao.LoginHistoryDAO;
import com.auth.entity.LoginHistory;
import com.auth.service.LoginHistoryService;

@Service
public class LoginHistoryServiceImpl implements LoginHistoryService {

	@Autowired
	private LoginHistoryDAO historyDAO;

	@Override
	public LoginHistory createHistory(LoginHistory history) {
		// TODO Auto-generated method stub
		return historyDAO.createLoginHistory(history);
	}

	public long getMaxId() {
		long val = historyDAO.getMaxId();
		if ( val <= 0  ) {
			return 1;
		} 
		return val;
	}
}

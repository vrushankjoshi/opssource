package com.auth.dao;

import com.auth.entity.LoginHistory;

public interface LoginHistoryDAO {

	public LoginHistory createLoginHistory(LoginHistory history);
	public long getMaxId();
	
}

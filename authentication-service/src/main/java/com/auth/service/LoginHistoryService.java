package com.auth.service;

import com.auth.entity.LoginHistory;

public interface LoginHistoryService {
	public LoginHistory createHistory(LoginHistory history);

	public long getMaxId();
}

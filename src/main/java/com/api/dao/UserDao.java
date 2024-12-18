package com.api.dao;

import com.api.entity.User;
import com.api.security.CustomUserDetail;

public interface UserDao {
	public CustomUserDetail loadUserByUserId(String userId);

	User loginUser(User user);
	
	
	
}



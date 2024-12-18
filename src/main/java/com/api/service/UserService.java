package com.api.service;


import javax.transaction.Transactional;

import com.api.entity.User;
import com.api.security.CustomUserDetail;

@Transactional
public interface UserService {

	CustomUserDetail loadUserByUserId(String userId);

	User loginUser(User user);



}
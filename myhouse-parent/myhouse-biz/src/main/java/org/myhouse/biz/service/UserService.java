package org.myhouse.biz.service;

import org.myhouse.biz.mapper.UserMapper;
import org.myhouse.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	
	public boolean saveUser(User user){
		return true;
	}
	
}

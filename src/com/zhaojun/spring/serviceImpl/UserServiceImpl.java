package com.zhaojun.spring.serviceImpl;

import javax.sql.DataSource;

import com.zhaojun.spring.dao.UserDao;
import com.zhaojun.spring.model.User;
import com.zhaojun.spring.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	@Override
	public void userService(User user) {
		userDao.save(user);
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public UserServiceImpl() {
		System.out.println("UserServiceImpl≥ı ºªØ");
	}

}

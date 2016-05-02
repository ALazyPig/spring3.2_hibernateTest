package com.zhaojun.spring.dao;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhaojun.spring.model.User;



public class UserDaoTest{
	
	@Test
	public void userDaoTest(){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userDao = (UserDao)context.getBean("userDao");
		User user = new User();
		user.setAge(123345);
		user.setName("xiaozhaoooo");
		userDao.add(user);
	}
}

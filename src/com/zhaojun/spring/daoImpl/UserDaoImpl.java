package com.zhaojun.spring.daoImpl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zhaojun.spring.dao.UserDao;
import com.zhaojun.spring.model.User;

public class UserDaoImpl implements UserDao{
	
	private SessionFactory sessionFactory;
	@Override
	public void save(User user){
		System.out.println("hello,spring");
	}

	public UserDaoImpl() {
		System.out.println("UserDaoImpl³õÊ¼»¯");
	}

	@Override
	public void add(User user) {
		System.out.println(sessionFactory.toString());
		Session s = sessionFactory.getCurrentSession();
		s.save(user);
		
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		System.out.println("×¢ÈësessionFactory");
		this.sessionFactory = sessionFactory;
	}
	
}

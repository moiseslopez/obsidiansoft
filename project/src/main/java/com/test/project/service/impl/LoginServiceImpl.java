package com.test.project.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.project.dao.LoginDao;
import com.test.project.model.Person;
import com.test.project.model.UserM;
import com.test.project.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao;
	
	@Transactional
	public boolean authenticate(Person user) {
		Person person =  loginDao.authenticate(user);
		if (person.getPassword().equals(user.getPassword())) {
			return true;
		} else {
			return false;
		}
	}
	
}

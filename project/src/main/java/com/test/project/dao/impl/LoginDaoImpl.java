package com.test.project.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.project.dao.LoginDao;
import com.test.project.model.Person;

@Repository
public class LoginDaoImpl implements LoginDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public Person authenticate(Person person) {
		Session session = sessionFactory.getCurrentSession();
		
		String hql = "FROM Person where email = :email";
		Query query = session.createQuery(hql);
		query.setParameter("email", person.getEmail());
		
		Person personAuth = (Person) query.uniqueResult();
		
		return personAuth;
	}
	
}

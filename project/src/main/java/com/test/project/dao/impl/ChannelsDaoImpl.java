package com.test.project.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.project.dao.ChannelsDao;
import com.test.project.model.Channels;
import com.test.project.model.Messages;
import com.test.project.model.Person;

@Repository
public class ChannelsDaoImpl implements ChannelsDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public List<Person> getFriends() {
		
		Session session = sessionFactory.getCurrentSession();
		
		String hql = "FROM Person ";
		Query query = session.createQuery(hql);
		
		List<Person> friends =  query.list();
		
		return friends;
	}

	public List<Channels> getChannels() {
		Session session = sessionFactory.getCurrentSession();
		
		String hql = "FROM Channels ";
		Query query = session.createQuery(hql);
		
		List<Channels> channels =  query.list();
		
		return channels;
	}

	public List<Messages> getMessages() {
		Session session = sessionFactory.getCurrentSession();
		
		String hql = "FROM Messages ";
		Query query = session.createQuery(hql);
		
		List<Messages> messages =  query.list();
		
		return messages;
	}

}

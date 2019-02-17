package com.test.project.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.project.dao.ChannelsDao;
import com.test.project.model.Channels;
import com.test.project.model.Messages;
import com.test.project.model.Person;
import com.test.project.service.ChannelService;

@Service
public class ChannelServiceImpl implements ChannelService{

	@Autowired
	ChannelsDao channelsDao;
	
	@Transactional
	public List<Person> getFriends() {
		return channelsDao.getFriends();
	}

	@Transactional
	public List<Channels> getChannels() {
		return channelsDao.getChannels();
	}
	
	@Transactional
	public List<Messages> getMessages() {
		return channelsDao.getMessages();
	}
}

package com.test.project.dao;

import java.util.List;

import com.test.project.model.Channels;
import com.test.project.model.Messages;
import com.test.project.model.Person;

public interface ChannelsDao {
	
	public List<Person> getFriends();
	public List<Channels> getChannels();
	public List<Messages> getMessages();

}

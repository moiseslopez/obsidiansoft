package com.test.project.service;

import java.util.List;

import com.test.project.model.Channels;
import com.test.project.model.Messages;
import com.test.project.model.Person;

public interface ChannelService {
	
	public List<Person> getFriends();
	public List<Channels> getChannels();
	public List<Messages> getMessages();

}

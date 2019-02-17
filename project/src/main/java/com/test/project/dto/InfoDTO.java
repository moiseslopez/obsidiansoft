package com.test.project.dto;

import java.util.List;

import com.test.project.model.Channels;
import com.test.project.model.Messages;
import com.test.project.model.Person;

public class InfoDTO {
	List<Person> friends;
	List<Channels> channels;
	List<Messages> messages;
	
	public List<Person> getFriends() {
		return friends;
	}
	public void setFriends(List<Person> friends) {
		this.friends = friends;
	}
	public List<Channels> getChannels() {
		return channels;
	}
	public void setChannels(List<Channels> channels) {
		this.channels = channels;
	}
	public List<Messages> getMessages() {
		return messages;
	}
	public void setMessages(List<Messages> messages) {
		this.messages = messages;
	}
}

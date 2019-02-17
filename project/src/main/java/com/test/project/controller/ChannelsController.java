package com.test.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.project.dto.InfoDTO;
import com.test.project.model.Channels;
import com.test.project.model.Messages;
import com.test.project.model.Person;
import com.test.project.model.Response;
import com.test.project.service.ChannelService;

@RestController
@RequestMapping("/channel")
public class ChannelsController {
	@Autowired
	ChannelService channelService;
	
	@RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
	public Response getInformation(Model model) {
		
		List<Person> friends = channelService.getFriends();
		List<Channels> channels = channelService.getChannels();
		List<Messages> messages = channelService.getMessages();
		
		InfoDTO infoDTO = new InfoDTO();
		
		infoDTO.setFriends(friends);
		infoDTO.setChannels(channels);
		infoDTO.setMessages(messages);
		
		List<InfoDTO> information = new ArrayList<InfoDTO>();
		information.add(infoDTO);
		
		Response response = new Response();
		response.setStatus("success");
		response.setDatos(information);
		
		return response;
	}
}

package com.test.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.project.model.Response;
import com.test.project.model.UserM;

@Controller
@RequestMapping("/admin")
public class MainController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		return "/login";
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String mainPanel(Model model) {
		return "/mainpanel";
	}
	
}

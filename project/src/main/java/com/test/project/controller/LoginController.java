package com.test.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.project.model.Person;
import com.test.project.model.Response;
import com.test.project.model.UserM;
import com.test.project.service.LoginService;

@RestController
@RequestMapping("/user")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public Response authenticate (@RequestBody Person user) {
		Response response = new Response();
		try {
			boolean logged = loginService.authenticate(user);
			if (logged) {
				response.setStatus("success");
				response.setMensaje("Usuario autenticado correctamente");
			} else {
				response.setStatus("Error");
				response.setMensaje("Usuario y/o contraseña incorrectos");
			}
			
		} catch (Exception e) {
			response.setStatus("Error en el servicio");
		}
		
		return response;
	}
}

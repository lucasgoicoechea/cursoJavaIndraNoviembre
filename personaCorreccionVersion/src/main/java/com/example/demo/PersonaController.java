package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;

	@RequestMapping(value = "/personas", method =  RequestMethod.GET)
	@ResponseBody
	public Iterable<Persona> getPersonas() {
		return personaService.findAll();
	}
	
}
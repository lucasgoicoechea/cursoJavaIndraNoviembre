package es.indra.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;

import es.indra.Interfaces.PersonaService;
import es.indra.Models.Persona;

@RestController

@CrossOrigin(origins = "*")

public class PersonaController {

	@Autowired

	private PersonaService personaService;

	@RequestMapping(value = "/personas", method = RequestMethod.GET)

	@ResponseBody

	public Iterable<Persona> getPersonas() {

		return personaService.findAll();

	}

	@PostMapping(value = "/savePersona")
	@ResponseBody
	public Persona savePersona(@RequestBody Persona personaParam) {
		this.personaService.save(personaParam);
		return personaParam;
	}

	@RequestMapping(value = "/deletePersonas", method = RequestMethod.DELETE)
	public boolean borrarPersona(@RequestParam int idPersona) {
		this.personaService.deleteById(idPersona);
		return true;
	}

}
package com.indra.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin(origins ="http://localhost:4200")
public class PersonaController {
	
	@Autowired
	PersonaService personalService;

	
}

package com.cursoJava.mvc;

import javax.swing.text.html.parser.Entity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
	
	@RequestMapping(value = "/home")
	public String home() {
		return "index.jsp";
	}
	
	@GetMapping(value = "/home/{page}")
	public String home(
	@RequestParam String page, 
	@RequestHeader("Accept-Encoding") String encoding,
	@CookieValue("language") String lang,
	@RequestBody Entity entity) {
		return "index.jsp";
	}
	
	
}

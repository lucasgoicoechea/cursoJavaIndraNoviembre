package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*")
public class LenguajeProgramacionController {
	
	@Autowired
	private LenguajeProgramacionService LenguajeProgramacionService;

	@RequestMapping(value = "/lenguajeprogramacion", method =  RequestMethod.GET)
	@ResponseBody
	public Iterable<LenguajeProgramacion> getLenguajeProgramacion() {
		return LenguajeProgramacionService.findAll();
	}
	
	@RequestMapping(value = "/lenguajeprogramacionid", method = RequestMethod.GET)
	@ResponseBody
	public Iterable<LenguajeProgramacion> getLenguajeProgramacionByName(@RequestParam("name") String name) {
		return LenguajeProgramacionService.find(name);
	}
	
}


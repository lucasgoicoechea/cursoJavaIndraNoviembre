package es.indra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*")
public class DeporteController {
	
	@Autowired
	private DeporteService deporteService;
	
	@RequestMapping(value="/deportes",method=RequestMethod.GET)
	@ResponseBody
	public Iterable<Deporte> getDeportes(){
		return deporteService.findAll();
	}
	
	@RequestMapping(value="/deportesnombre",method=RequestMethod.GET)
	@ResponseBody
	public Iterable<Deporte> getDeportesByName(@RequestParam("name") String name){
		return deporteService.find(name);
	}

}

package es.indra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*")
public class PilotoController {
	
	@Autowired
	private PilotoService pilotoService;

	@RequestMapping(value = "/pilotos", method =  RequestMethod.GET)
	@ResponseBody
	public Iterable<Piloto> getPilotos() {
		return pilotoService.findAll();
	}
	@RequestMapping(value = "/savepiloto", method =  RequestMethod.POST)
	@ResponseBody
	public Piloto setpiloto(@RequestBody Piloto piloto) {
		pilotoService.save(piloto);
		return piloto;
	}
	@RequestMapping(value = "/deletepiloto", method =  RequestMethod.DELETE)
	@ResponseBody
	public void deletepiloto(@RequestParam("id") String id) {
		pilotoService.deleteById(Integer.parseInt(id));
	}
}

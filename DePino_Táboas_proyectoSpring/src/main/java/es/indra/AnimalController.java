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
public class AnimalController {
	
	@Autowired
	private AnimalService animalService;

	@RequestMapping(value = "/getAnimales", method =  RequestMethod.GET)
	@ResponseBody
	public Iterable<Animal> getAnimales() {
		
		return animalService.findAll();
	}
	
	@RequestMapping(value = "/getAnimal", method =  RequestMethod.GET)
	@ResponseBody
	public Iterable<Animal> getAnimal(@RequestParam String name) {
		
		return animalService.findByName(name);
	}
	
}
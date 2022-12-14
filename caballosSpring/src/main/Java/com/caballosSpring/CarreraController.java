package com.caballosSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.caballosSpring.model.Carrera;
import com.caballosSpring.service.*;

@Controller
public class CarreraController {
private CarreraService carreraService;
	
	@Autowired(required=true)
	@Qualifier(value="carreraService")
	public void setcarreraService(CarreraService ps){
		this.carreraService = ps;
	}
	
	@RequestMapping(value = "/carreras", method = RequestMethod.GET)
	public String listcarreras(Model model) {
		model.addAttribute("carrera", new Carrera());
		model.addAttribute("listcarreras", this.carreraService.listCarreras());
		return "carrera";
	}
	
	//For add and update carrera both
	@RequestMapping(value= "/carrera/add", method = RequestMethod.POST)
	public String addcarrera(@ModelAttribute("carrera") Carrera p){
		
		if(p.getId() == 0){
			//new Carrera, add it
			this.carreraService.addCarrera(p);
		}else{
			//existing Carrera, call update
			this.carreraService.updateCarrera(p);
		}
		
		return "redirect:/carreras";
		
	}
	
	@RequestMapping("/remove/{id}")
    public String removecarrera(@PathVariable("id") int id){
		
        this.carreraService.removeCarrera(id);
        return "redirect:/carreras";
    }
 
    @RequestMapping("/edit/{id}")
    public String editcarrera(@PathVariable("id") int id, Model model){
        model.addAttribute("carrera", this.carreraService.getCarreraById(id));
        model.addAttribute("listcarreras", this.carreraService.listCarreras());
		return "carrera";
	}

}

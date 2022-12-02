package com.caballosSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.caballosSpring.model.Caballo;
import com.caballosSpring.service.*;

@Controller
public class CaballoController {
private CaballoService caballoService;
	
	@Autowired(required=true)
	@Qualifier(value="caballoService")
	public void setcaballoService(CaballoService ps){
		this.caballoService = ps;
	}
	
	@RequestMapping(value = "/caballos", method = RequestMethod.GET)
	public String listcaballos(Model model) {
		model.addAttribute("caballo", new Caballo());
		model.addAttribute("listcaballos", this.caballoService.listCaballos());
		return "caballo";
	}
	
	//For add and update caballo both
	@RequestMapping(value= "/caballo/add", method = RequestMethod.POST)
	public String addcaballo(@ModelAttribute("caballo") Caballo p){
		
		if(p.getId() == 0){
			//new Caballo, add it
			this.caballoService.addCaballo(p);
		}else{
			//existing Caballo, call update
			this.caballoService.updateCaballo(p);
		}
		
		return "redirect:/caballos";
		
	}
	
	@RequestMapping("/remove/{id}")
    public String removecaballo(@PathVariable("id") int id){
		
        this.caballoService.removeCaballo(id);
        return "redirect:/caballos";
    }
 
    @RequestMapping("/edit/{id}")
    public String editcaballo(@PathVariable("id") int id, Model model){
        model.addAttribute("caballo", this.caballoService.getCaballoById(id));
        model.addAttribute("listcaballos", this.caballoService.listCaballos());
        return "caballo";
    }

}

package controller;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.beans.factory.annotation.Qualifier;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

import model.Carretera;
import model.Señal;
import service.CarreteraService;


	@Controller
	public class CarreteraController {
		
		private CarreteraService carreteraService;
		
		@Autowired(required=true)
		@Qualifier(value="carreteraService")
		public void setCarreteraService(CarreteraService ps){
			this.carreteraService = ps;
		}
		
		@RequestMapping(value = "/señales", method = RequestMethod.GET)
		public String listSeñales(Model model) {
			model.addAttribute("carretera", new Carretera());
			model.addAttribute("listSeñales", this.carreteraService.getSeñales());
			return "señales";
		}
		
		//For add and update person both
		@RequestMapping(value= "/señal/add", method = RequestMethod.POST)
		public String addSeñal(@ModelAttribute("señal") Señal p){
			
			if(p.getId() == 0){
				this.carreteraService.insertarSeñal(p);
			}else{
				this.carreteraService.actualizarSeñal(p);
			}
			
			return "redirect:/señales";
			
		}
		
		@RequestMapping("/remove/{id}")
	    public String removePerson(@PathVariable("id") int id){
			
	        this.carreteraService.borrarSeñal(id);
	        return "redirect:/señales";
	    }
	 
	    @RequestMapping("/edit/{id}")
	    public String editSeñal(@PathVariable("id") int id, Model model){
	        model.addAttribute("señal", this.carreteraService.consultarId(id));
	        model.addAttribute("listSeñales", this.carreteraService.getSeñales());
	        return "señal";
	    }


}

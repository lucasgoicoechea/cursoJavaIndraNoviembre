package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.Rocket;
import springmvc.service.RocketService;

@Controller
public class RocketController {
	private RocketService rocketService;
	
	@Autowired(required=true)
	@Qualifier(value="RocketService")
	public void setRocketService(RocketService rs){
		this.rocketService = rs;
	}
	
	@RequestMapping(value = "/rockets", method = RequestMethod.GET)
	public String listrockets(Model model) {
		model.addAttribute("rocket", new Rocket());
		model.addAttribute("listrockets", this.rocketService.listRocket());
		return "rocket";
	}
	
	//For add and update rocket both
	@RequestMapping(value= "/rocket/add", method = RequestMethod.POST)
	public String addrocket(@ModelAttribute("rocket") Rocket r){
		
		if(r.getId() == 0){
			//new rocket, add it
			this.rocketService.addRocket(r);
		}else{
			//existing rocket, call update
			this.rocketService.updateRocket(r);
		}
		
		return "redirect:/rockets";
		
	}
	
	@RequestMapping("/remove/{id}")
    public String removerocket(@PathVariable("id") int id){
		
        this.rocketService.removeRocket(id);
        return "redirect:/rockets";
    }
 
    @RequestMapping("/edit/{id}")
    public String editrocket(@PathVariable("id") int id, Model model){
        model.addAttribute("rocket", this.rocketService.getRocketById(id));
        model.addAttribute("listrockets", this.rocketService.listRocket());
        return "rocket";
    }
	

}

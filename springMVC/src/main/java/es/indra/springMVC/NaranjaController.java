package es.indra.springMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.indra.springMVC.model.Naranja;
import es.indra.springMVC.service.NaranjaService;

@Controller
public class NaranjaController {

	private NaranjaService NaranjaService;

	@Autowired(required = true)

	@Qualifier(value = "NaranjaService")

	public void setNaranjaService(NaranjaService ps) {

		this.NaranjaService = ps;

	}

	@RequestMapping(value = "/Naranjas", method = RequestMethod.GET)

	public String listNaranjas(Model model) {

		model.addAttribute("Naranja", new Naranja());

		model.addAttribute("listNaranjas", this.NaranjaService.listNaranjas());

		return "Naranja";

	}

//For add and update Naranja both

	@RequestMapping(value = "/Naranja/add", method = RequestMethod.POST)

	public String addNaranja(@ModelAttribute("Naranja") Naranja p) {

		if (p.getId() == 0) {

//new Naranja, add it

			this.NaranjaService.addNaranja(p);

		} else {

//existing Naranja, call update

			this.NaranjaService.updateNaranja(p);

		}

		return "redirect:/Naranjas";

	}

	@RequestMapping("/remove/{id}")

	public String removeNaranja(@PathVariable("id") int id) {

		this.NaranjaService.removeNaranja(id);

		return "redirect:/Naranjas";

	}

	@RequestMapping("/edit/{id}")

	public String editNaranja(@PathVariable("id") int id, Model model) {

		model.addAttribute("Naranja", this.NaranjaService.getNaranjaById(id));

		model.addAttribute("listNaranjas", this.NaranjaService.listNaranjas());

		return "Naranja";

	}
}
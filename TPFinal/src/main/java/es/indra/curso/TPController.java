package es.indra.curso;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins ="*")
public class TPController {

		
		@Autowired
		private TPService tpService;

		//Metodo get para obtener todos los oficios
		@RequestMapping(value = "/coches", method =  RequestMethod.GET)
		@ResponseBody
		public Iterable<Coche> getOficios() {
			return tpService.findAll();
		}
		
		@PostMapping(value = "/saveCoche")
        @ResponseBody
        public Coche saveCoche(@RequestBody Coche cocheParam) {
            System.out.print(cocheParam);
            this.tpService.save(cocheParam);
            return cocheParam;
        }

        //@DeleteMapping
        @RequestMapping(value = "/deleteCoche", method =  RequestMethod.DELETE)
        public boolean borrarCoche(@RequestParam(name = "idCoche") int idCoche) {
            this.tpService.deleteById(idCoche);
            return true;
        }
        
        @PutMapping(value = "/updateCoche")
        @ResponseBody
        public Coche updateCoche(@RequestBody Coche cocheParam,@RequestParam(name = "idCoche") int idCoche) {
        	
        	if(tpService.existsById(idCoche)==true)
            this.tpService.save(cocheParam);
            
        	return cocheParam;
        }

}

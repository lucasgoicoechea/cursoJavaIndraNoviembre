package es.indra.curso;

import java.util.Iterator;
import java.util.Optional;

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
public class OficioController {
	@Autowired
	private OficioService oficioService;

	@RequestMapping(value = "/oficios", method =  RequestMethod.GET)
	@ResponseBody
	public Iterable<Oficio> getOficios() {
		return oficioService.findAll();
	}
	
	 
    @RequestMapping(value = "/buscarOficios", method =  RequestMethod.GET)
    public Oficio buscarOficio(@RequestParam(name = "nombre") String nombre) {
    	Iterable<Oficio>oficios =this.oficioService.findAll();
    	boolean find=false;
    	Oficio resultado=null;
    	Iterator iterador=oficios.iterator();
    	while(iterador.hasNext()&& !find) {
    		Oficio aux=(Oficio) iterador.next();
    		if(aux.getNombre().equals(nombre))
    		{
    			find =true;
    			resultado=aux;
    		}
    }
	
    	return resultado;
	
    }

    }

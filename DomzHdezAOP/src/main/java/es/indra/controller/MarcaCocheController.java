package es.indra.controller;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

 

import es.indra.model.MarcaCoche;
import es.indra.service.MarcaCocheService;

 

@RestController
@CrossOrigin(origins = "*")
public class MarcaCocheController {

 

    @Autowired
    private MarcaCocheService mCocheService;

 

    @RequestMapping(value = "/marcaCoche", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<MarcaCoche> getMarcaCoches() {
        return mCocheService.findAll();
    }

 

    @RequestMapping(value = "/nombreMarcaCoches", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<MarcaCoche> getMarcaCochesByName(@RequestParam("name") String name) {
        return mCocheService.find(name);
    }

 

}

package es.indra.springMVC.service;

import java.util.List;

import es.indra.springMVC.model.Naranja;

public interface NaranjaService {

	public void addNaranja(Naranja p);

	public void updateNaranja(Naranja p);

	public List<Naranja> listNaranjas();

	public Naranja getNaranjaById(int id);

	public void removeNaranja(int id);

}

package es.indra.springMVC.dao;

import java.util.List;

import es.indra.springMVC.model.Naranja;

public interface NaranjaDAO {

public void addNaranja(Naranja p);

public void updateNaranja(Naranja p);

public List<Naranja> listNaranjas();

public Naranja getNaranjaById(int id);

public void removeNaranja(int id);

}
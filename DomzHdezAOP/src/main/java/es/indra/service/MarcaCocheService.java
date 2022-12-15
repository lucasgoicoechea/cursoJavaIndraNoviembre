package es.indra.service;

import es.indra.model.MarcaCoche;

public interface MarcaCocheService {

	Iterable<MarcaCoche> findAll();

	Iterable<MarcaCoche> find(String name);
	
}

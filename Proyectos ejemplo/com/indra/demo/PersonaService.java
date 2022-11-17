package com.indra.demo;

import java.util.Optional;

public interface PersonaService {

	<S extends Persona> S save(S entity);

	<S extends Persona> Iterable<S> saveAll(Iterable<S> entities);

	Optional<Persona> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<Persona> findAll();

	Iterable<Persona> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(Persona entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends Persona> entities);

	void deleteAll();

}
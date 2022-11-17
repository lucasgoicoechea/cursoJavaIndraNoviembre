package com.indra.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {
	
	@Autowired
	PersonaRepositorio personalRepositorio;

	@Override
	public <S extends Persona> S save(S entity) {
		return personalRepositorio.save(entity);
	}

	@Override
	public <S extends Persona> Iterable<S> saveAll(Iterable<S> entities) {
		return personalRepositorio.saveAll(entities);
	}

	@Override
	public Optional<Persona> findById(Integer id) {
		return personalRepositorio.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return personalRepositorio.existsById(id);
	}

	@Override
	public Iterable<Persona> findAll() {
		return personalRepositorio.findAll();
	}

	@Override
	public Iterable<Persona> findAllById(Iterable<Integer> ids) {
		return personalRepositorio.findAllById(ids);
	}

	@Override
	public long count() {
		return personalRepositorio.count();
	}

	@Override
	public void deleteById(Integer id) {
		personalRepositorio.deleteById(id);
	}

	@Override
	public void delete(Persona entity) {
		personalRepositorio.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		personalRepositorio.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Persona> entities) {
		personalRepositorio.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		personalRepositorio.deleteAll();
	}
	
	
}

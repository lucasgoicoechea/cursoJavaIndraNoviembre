package com.example.demo;

import java.util.Optional;

public interface LenguajeProgramacionService {

	<S extends LenguajeProgramacion> S save(S entity);

	<S extends LenguajeProgramacion> Iterable<S> saveAll(Iterable<S> entities);

	Optional<LenguajeProgramacion> findById(Integer id);
	Iterable<LenguajeProgramacion> find(String valor);

	boolean existsById(Integer id);

	Iterable<LenguajeProgramacion> findAll();

	Iterable<LenguajeProgramacion> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(LenguajeProgramacion entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends LenguajeProgramacion> entities);

	void deleteAll();

}

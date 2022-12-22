package es.indra;

import java.util.Optional;


public interface PilotoService {

	<S extends Piloto> S save(S entity);

	<S extends Piloto> Iterable<S> saveAll(Iterable<S> entities);

	Optional<Piloto> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<Piloto> findAll();

	Iterable<Piloto> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(Piloto entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends Piloto> entities);

	void deleteAll();

}

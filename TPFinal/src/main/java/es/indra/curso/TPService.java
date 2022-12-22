package es.indra.curso;

import java.util.Optional;

public interface TPService {

	<S extends Coche> S save(S entity);

	<S extends Coche> Iterable<S> saveAll(Iterable<S> entities);

	Optional<Coche> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<Coche> findAll();

	Iterable<Coche> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(Coche entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends Coche> entities);

	void deleteAll();
}

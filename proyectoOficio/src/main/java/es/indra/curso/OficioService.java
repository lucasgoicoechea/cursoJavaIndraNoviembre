package es.indra.curso;

import java.util.Optional;

public interface OficioService {

	<S extends Oficio> S save(S entity);

	<S extends Oficio> Iterable<S> saveAll(Iterable<S> entities);

	Optional<Oficio> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<Oficio> findAll();

	Iterable<Oficio> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(Oficio entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends Oficio> entities);

	void deleteAll();
}

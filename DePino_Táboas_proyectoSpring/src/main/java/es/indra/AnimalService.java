package es.indra;

import java.util.List;
import java.util.Optional;


public interface AnimalService {

	<S extends Animal> S save(S entity);

	<S extends Animal> Iterable<S> saveAll(Iterable<S> entities);

	Optional<Animal> findById(Integer id);
	
	List<Animal> findByName(String name);

	boolean existsById(Integer id);

	Iterable<Animal> findAll();

	Iterable<Animal> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(Animal entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends Animal> entities);

	void deleteAll();

}

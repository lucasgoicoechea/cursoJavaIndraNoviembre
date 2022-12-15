package es.indra;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceImpl implements AnimalService {
	
	@Autowired
	AnimalRepositorio animalRepositorio;

	@Override
	public <S extends Animal> S save(S entity) {
		return animalRepositorio.save(entity);
	}

	@Override
	public <S extends Animal> Iterable<S> saveAll(Iterable<S> entities) {
		return animalRepositorio.saveAll(entities);
	}

	@Override
	public Optional<Animal> findById(Integer id) {
		return animalRepositorio.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return animalRepositorio.existsById(id);
	}

	@Override
	public Iterable<Animal> findAll() {
		return animalRepositorio.findAll();
	}

	@Override
	public Iterable<Animal> findAllById(Iterable<Integer> ids) {
		return animalRepositorio.findAllById(ids);
	}

	@Override
	public long count() {
		return animalRepositorio.count();
	}

	@Override
	public void deleteById(Integer id) {
		animalRepositorio.deleteById(id);
	}

	@Override
	public void delete(Animal entity) {
		animalRepositorio.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		animalRepositorio.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Animal> entities) {
		animalRepositorio.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		animalRepositorio.deleteAll();
	}

	@Override
	public List<Animal> findByName(String name) {
		return animalRepositorio.findAnimalByName(name);
	}
	
	
}


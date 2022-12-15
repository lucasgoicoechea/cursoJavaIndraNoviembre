package es.indra;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepositorio extends CrudRepository<Animal, Integer> {
	List<Animal> findAnimalByName(String name);
}


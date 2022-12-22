package es.indra;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotoRepositorio extends CrudRepository<Piloto, Integer> {
	
}

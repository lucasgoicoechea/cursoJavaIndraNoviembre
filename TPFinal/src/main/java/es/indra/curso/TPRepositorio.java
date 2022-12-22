package es.indra.curso;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TPRepositorio extends CrudRepository<Coche, Integer>{
	
}
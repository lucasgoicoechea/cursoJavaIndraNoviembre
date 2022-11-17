package com.indra.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends CrudRepository<Persona,Integer> {

}

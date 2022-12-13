package es.indra.Interfaces;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import es.indra.Models.Persona;

@Repository
public interface PersonaRepositorio extends CrudRepository<Persona, Integer> {

}

package es.indra;

import java.util.Optional;

public interface DeporteService {

	Iterable<Deporte> findAll();

	Iterable<Deporte> find(String name);
}

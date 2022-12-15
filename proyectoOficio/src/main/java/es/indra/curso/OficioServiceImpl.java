package es.indra.curso;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OficioServiceImpl implements OficioService{

	@Autowired
	OficioRepositorio OficioRepositorio;

	@Override
	public <S extends Oficio> S save(S entity) {
		return OficioRepositorio.save(entity);
	}

	@Override
	public <S extends Oficio> Iterable<S> saveAll(Iterable<S> entities) {
		return OficioRepositorio.saveAll(entities);
	}

	@Override
	public Optional<Oficio> findById(Integer id) {
		return OficioRepositorio.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return OficioRepositorio.existsById(id);
	}

	@Override
	public Iterable<Oficio> findAll() {
		return OficioRepositorio.findAll();
	}

	@Override
	public Iterable<Oficio> findAllById(Iterable<Integer> ids) {
		return OficioRepositorio.findAllById(ids);
	}

	@Override
	public long count() {
		return OficioRepositorio.count();
	}

	@Override
	public void deleteById(Integer id) {
		OficioRepositorio.deleteById(id);
	}

	@Override
	public void delete(Oficio entity) {
		OficioRepositorio.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		OficioRepositorio.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Oficio> entities) {
		OficioRepositorio.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		OficioRepositorio.deleteAll();
	}
	

}

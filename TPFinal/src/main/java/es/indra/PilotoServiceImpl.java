package es.indra;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PilotoServiceImpl implements PilotoService {
	
	@Autowired
	PilotoRepositorio pilotoRepositorio;
	@Autowired
	CazaRepositorio cazaRepositorio;

	@Override
	public <S extends Piloto> S save(S entity) {
		cazaRepositorio.save(entity.caza);
		return pilotoRepositorio.save(entity);
	}

	@Override
	public <S extends Piloto> Iterable<S> saveAll(Iterable<S> entities) {
		return pilotoRepositorio.saveAll(entities);
	}

	@Override
	public Optional<Piloto> findById(Integer id) {
		return pilotoRepositorio.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return pilotoRepositorio.existsById(id);
	}

	@Override
	public Iterable<Piloto> findAll() {
		return pilotoRepositorio.findAll();
	}

	@Override
	public Iterable<Piloto> findAllById(Iterable<Integer> ids) {
		return pilotoRepositorio.findAllById(ids);
	}

	@Override
	public long count() {
		return pilotoRepositorio.count();
	}

	@Override
	public void deleteById(Integer id) {
		pilotoRepositorio.deleteById(id);
	}

	@Override
	public void delete(Piloto entity) {
		pilotoRepositorio.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		pilotoRepositorio.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Piloto> entities) {
		pilotoRepositorio.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		pilotoRepositorio.deleteAll();
	}
	
	
}

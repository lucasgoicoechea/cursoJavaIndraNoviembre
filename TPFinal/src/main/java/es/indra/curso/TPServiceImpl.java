package es.indra.curso;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TPServiceImpl implements TPService{

	@Autowired
	TPRepositorio TPRepositorio;

	@Override
	public <S extends Coche> S save(S entity) {
		return TPRepositorio.save(entity);
	}

	@Override
	public <S extends Coche> Iterable<S> saveAll(Iterable<S> entities) {
		return TPRepositorio.saveAll(entities);
	}

	@Override
	public Optional<Coche> findById(Integer id) {
		return TPRepositorio.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return TPRepositorio.existsById(id);
	}

	@Override
	public Iterable<Coche> findAll() {
		return TPRepositorio.findAll();
	}

	@Override
	public Iterable<Coche> findAllById(Iterable<Integer> ids) {
		return TPRepositorio.findAllById(ids);
	}

	@Override
	public long count() {
		return TPRepositorio.count();
	}

	@Override
	public void deleteById(Integer id) {
		TPRepositorio.deleteById(id);
	}

	@Override
	public void delete(Coche entity) {
		TPRepositorio.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		TPRepositorio.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Coche> entities) {
		TPRepositorio.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		TPRepositorio.deleteAll();
	}
}


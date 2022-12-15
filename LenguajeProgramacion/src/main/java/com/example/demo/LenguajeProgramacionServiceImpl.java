package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LenguajeProgramacionServiceImpl implements LenguajeProgramacionService {
		
		@Autowired
		LenguajeProgramacionRepository lenguajeProgramacionRepositorio;

		@Override
		public <S extends LenguajeProgramacion> S save(S entity) {
			return lenguajeProgramacionRepositorio.save(entity);
		}

		@Override
		public <S extends LenguajeProgramacion> Iterable<S> saveAll(Iterable<S> entities) {
			return lenguajeProgramacionRepositorio.saveAll(entities);
		}

		@Override
		public Optional<LenguajeProgramacion> findById(Integer id) {
			return lenguajeProgramacionRepositorio.findById(id);
		}

		@Override
		public boolean existsById(Integer id) {
			return lenguajeProgramacionRepositorio.existsById(id);
		}

		@Override
		public Iterable<LenguajeProgramacion> findAll() {
			return lenguajeProgramacionRepositorio.findAll();
		}

		@Override
		public Iterable<LenguajeProgramacion> findAllById(Iterable<Integer> ids) {
			return lenguajeProgramacionRepositorio.findAllById(ids);
		}

		@Override
		public long count() {
			return lenguajeProgramacionRepositorio.count();
		}

		@Override
		public void deleteById(Integer id) {
			lenguajeProgramacionRepositorio.deleteById(id);
		}

		@Override
		public void delete(LenguajeProgramacion entity) {
			lenguajeProgramacionRepositorio.delete(entity);
		}

		@Override
		public void deleteAllById(Iterable<? extends Integer> ids) {
			lenguajeProgramacionRepositorio.deleteAllById(ids);
		}

		@Override
		public void deleteAll(Iterable<? extends LenguajeProgramacion> entities) {
			lenguajeProgramacionRepositorio.deleteAll(entities);
		}

		@Override
		public void deleteAll() {
			lenguajeProgramacionRepositorio.deleteAll();
		}
		
		@Override
		public Iterable<LenguajeProgramacion> find(String valor) {
			Iterable<LenguajeProgramacion> lenguajeProgramacion = LenguajeProgramacionRepository.findAll();
			List<LenguajeProgramacion> lista = new ArrayList<>();
			for (LenguajeProgramacion lenguaje : lenguajeProgramacion) {
				if (lenguaje.getNombre().toLowerCase().equals(valor.toLowerCase())) {
					lista.add(lenguaje);
				}
			}
			return lista;
		}
		
}



package es.indra.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.indra.model.MarcaCoche;
import es.indra.repository.MarcaCocheRepositorio;

@Service
public class MarcaCocheServiceImpl implements MarcaCocheService {

	@Autowired
	MarcaCocheRepositorio mCocheRepositorio;

	@Override
	public Iterable<MarcaCoche> findAll() {
		return mCocheRepositorio.findAll();

	}

	@Override
	public Iterable<MarcaCoche> find(String valor) {
		Iterable<MarcaCoche> marcaCoches = mCocheRepositorio.findAll();
		List<MarcaCoche> listaCoches = new ArrayList<>();
		for (MarcaCoche mCoche : marcaCoches) {
			if (mCoche.getNombre().toLowerCase().equals(valor.toLowerCase())) {
				listaCoches.add(mCoche);
			}
		}
		return listaCoches;
	}
	
}

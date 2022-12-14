package es.indra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeporteServiceImpl implements DeporteService {

	@Autowired
	DeporteRepositorio deporteRepositorio;

	@Override
	public Iterable<Deporte> findAll() {
		return deporteRepositorio.findAll();

	}

	@Override
	public Iterable<Deporte> find(String valor) {
		Iterable<Deporte> deportes = deporteRepositorio.findAll();
		List<Deporte> deportesUtil = new ArrayList<>();
		for (Deporte deporte : deportes) {
			if (deporte.nombre.toLowerCase().equals(valor.toLowerCase())) {
				deportesUtil.add(deporte);
			}
		}
		return deportesUtil;
	}

}

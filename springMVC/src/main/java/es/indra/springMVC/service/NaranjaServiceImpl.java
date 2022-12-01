package es.indra.springMVC.service;

import java.util.List;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import es.indra.springMVC.dao.NaranjaDAO;

import es.indra.springMVC.model.Naranja;

@Service

public class NaranjaServiceImpl implements NaranjaService {

	private NaranjaDAO NaranjaDAO;

	public void setNaranjaDAO(NaranjaDAO NaranjaDAO) {

		this.NaranjaDAO = NaranjaDAO;

	}

	@Override

	@Transactional

	public void addNaranja(Naranja p) {

		this.NaranjaDAO.addNaranja(p);

	}

	@Override

	@Transactional

	public void updateNaranja(Naranja p) {

		this.NaranjaDAO.updateNaranja(p);
	}

	@Override

	@Transactional

	public List<Naranja> listNaranjas() {

		return this.NaranjaDAO.listNaranjas();

	}

	@Override

	@Transactional

	public Naranja getNaranjaById(int id) {

		return this.NaranjaDAO.getNaranjaById(id);

	}

	@Override

	@Transactional

	public void removeNaranja(int id) {

		this.NaranjaDAO.removeNaranja(id);

	}

}
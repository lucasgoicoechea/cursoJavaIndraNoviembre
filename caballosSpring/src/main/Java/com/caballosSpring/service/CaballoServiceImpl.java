package com.caballosSpring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caballosSpring.dao.CaballoDAO;
import com.caballosSpring.model.Caballo;

@Service
public class CaballoServiceImpl implements CaballoService {
	
	private CaballoDAO caballoDAO;

	public void setCaballoDAO(CaballoDAO caballoDAO) {
		this.caballoDAO = caballoDAO;
	}

	@Override
	@Transactional
	public void addCaballo(Caballo c) {
		this.caballoDAO.addCaballo(c);
	}

	@Override
	@Transactional
	public void updateCaballo(Caballo c) {
		this.caballoDAO.updateCaballo(c);
	}

	@Override
	@Transactional
	public List<Caballo> listCaballos() {
		return this.caballoDAO.listCaballos();
	}

	@Override
	@Transactional
	public Caballo getCaballoById(int id) {
		return this.caballoDAO.getCaballoById(id);
	}

	@Override
	@Transactional
	public void removeCaballo(int id) {
		this.caballoDAO.removeCaballo(id);
	}
}

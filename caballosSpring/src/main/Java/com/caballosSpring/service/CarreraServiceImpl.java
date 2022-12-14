package com.caballosSpring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caballosSpring.dao.CaballoDAO;
import com.caballosSpring.dao.CarreraDAO;
import com.caballosSpring.model.Caballo;
import com.caballosSpring.model.Carrera;

@Service
public class CarreraServiceImpl implements CarreraService {
	
	private CarreraDAO carreraDAO;

	public void setCarreraDAO(CarreraDAO carreraDAO) {
		this.carreraDAO = carreraDAO;
	}

	@Override
	@Transactional
	public void addCarrera(Carrera c) {
		this.carreraDAO.addCarrera(c);
	}

	@Override
	@Transactional
	public void updateCarrera(Carrera c) {
		this.carreraDAO.updateCarrera(c);
	}

	@Override
	@Transactional
	public List<Carrera> listCarreras() {
		return this.carreraDAO.listCarreras();
	}

	@Override
	@Transactional
	public Carrera getCarreraById(int id) {
		return this.carreraDAO.getCarreraById(id);
	}

	@Override
	@Transactional
	public void removeCarrera(int id) {
		this.carreraDAO.removeCarrera(id);
	}
}

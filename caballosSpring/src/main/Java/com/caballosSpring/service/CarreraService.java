package com.caballosSpring.service;

import java.util.List;

import com.caballosSpring.model.Caballo;
import com.caballosSpring.model.Carrera;

public interface CarreraService {

	public void addCarrera(Carrera c);
	public void updateCarrera(Carrera c);
	public List<Carrera> listCarreras();
	public Carrera getCarreraById(int id);
	public void removeCarrera(int id);

}
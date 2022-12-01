package com.caballosSpring.service;

import java.util.List;

import com.caballosSpring.model.Caballo;

public interface CaballoService {

	public void addCaballo(Caballo c);
	public void updateCaballo(Caballo c);
	public List<Caballo> listCaballos();
	public Caballo getCaballoById(int id);
	public void removeCaballo(int id);

}
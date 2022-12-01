package com.caballosSpring.dao;

import com.caballosSpring.model.Caballo;

import java.util.List;

public interface CaballoDAO {
	
	public void addCaballo(Caballo c);

	public void updateCaballo(Caballo c);

	public List<Caballo> listCaballos();

	public Caballo getCaballoById(int id);

	public void removeCaballo(int id);
}

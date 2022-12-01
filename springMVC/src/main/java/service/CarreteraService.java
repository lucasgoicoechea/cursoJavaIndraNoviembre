package service;

import java.util.ArrayList;

import model.Señal;

public interface  CarreteraService {

	public void insertarSeñal(Señal senal);
	
	public Señal consultarId(int id);
	
	public void borrarSeñal(int id);
	
	public void actualizarSeñal(Señal señal);
	
	public ArrayList<Señal> getSeñales();
	
}

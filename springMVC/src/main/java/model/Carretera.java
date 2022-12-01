package model;

import java.util.ArrayList;

public class Carretera {

	private int id;
	private String nombre;
	private int distancia;
	private ArrayList<Señal> señales;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	public ArrayList<Señal> getSeñales() {
		return señales;
	}
	public void setSeñales(ArrayList<Señal> señales) {
		this.señales = señales;
	}

	public int contarSeñales() {
		return señales.size();
	}
	
	public void añadirSeñal(Señal señal) {
		señales.add(señal);
	}
	
	public void borrarSeñal() {
		señales.remove(0);
	}

}

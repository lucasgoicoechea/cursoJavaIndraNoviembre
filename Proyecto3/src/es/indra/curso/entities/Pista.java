package es.indra.curso.entities;

import java.util.List;

public class Pista {
	
	protected String nombre;
	protected int largo;
	protected List<Corredor> corredores;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
	public List<Corredor> getCorredores() {
		return corredores;
	}
	public void setCorredores(List<Corredor> corredores) {
		this.corredores = corredores;
	}
	
	
}

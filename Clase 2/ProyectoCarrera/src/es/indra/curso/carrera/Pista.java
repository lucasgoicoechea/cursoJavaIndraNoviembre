package es.indra.curso.carrera;

import java.util.ArrayList;
import java.util.List;

public class Pista {

	protected String nombre;
	protected int largo;
	protected List<Corredor> corredores= new ArrayList<>();
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
	
	public Pista(String nombre, int largo, List<Corredor> corredores) {
		super();
		this.nombre = nombre;
		this.largo = largo;
		this.corredores = corredores;
	}
	public int velocidadEnPistaCorredor(Corredor _corredor) {
		return _corredor.velocidad*(_corredor.distancia-this.largo);
		
	}
	
}

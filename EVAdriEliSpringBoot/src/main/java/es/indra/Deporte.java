package es.indra;

import jakarta.persistence.*;

@Entity
@Table(name="deporte")
public class Deporte {

	@Id
	int id;
	
	String nombre;
	int prioridad;
	boolean grupal;
	
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
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	public boolean isGrupal() {
		return grupal;
	}
	public void setGrupal(boolean grupal) {
		this.grupal = grupal;
	}
	
	
}

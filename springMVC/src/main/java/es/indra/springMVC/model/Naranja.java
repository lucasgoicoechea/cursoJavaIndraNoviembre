package es.indra.springMVC.model;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity

@Table(name = "Naranja")

public class Naranja {

	@Id

	@Column(name = "id")

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;

	private String tamanio;
	
	private String nombre;

	private boolean madura;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean getMadura() {
		return madura;
	}

	public void setMadura(boolean madura) {
		this.madura = madura;
	}

	@Override

	public String toString() {
		return "id=" + id + ", nombre=" + nombre + ", tamanio=" + tamanio + ", madura=" + madura;
	}

}
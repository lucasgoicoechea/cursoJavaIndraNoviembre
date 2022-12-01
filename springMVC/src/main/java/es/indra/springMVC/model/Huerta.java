package es.indra.springMVC.model;

import java.util.List;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity

@Table(name = "HuertA")

public class Huerta {
	
	@Id

	@Column(name = "id")

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;

	private String tamanio;
	
	private String nombre;

	private String lugar;
	
	private List<Naranja> naranjas;
	
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
	
	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	public List<Naranja> getNaranjas()	{
		return naranjas;
	}
	
	public void setNaranjas(List<Naranja> naranjas) {
		this.naranjas = naranjas;
	}
	
	@Override

	public String toString() {
		return "id=" + id + ", nombre=" + nombre + ", tamanio=" + tamanio + ", lugar=" + lugar;
	}
}

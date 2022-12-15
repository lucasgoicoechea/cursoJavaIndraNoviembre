package com.example.demo;

import javax.persistence.Column;
//JPA
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lenguajeProgramacion")
public class LenguajeProgramacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column(name = "name")
	String nombre;

	Boolean vigente;

	// @OneToOne
	// Legajo legajo;

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

	public Boolean getVigente() {
		return vigente;
	}

	public void setVigente(Boolean vigente) {
		this.vigente = vigente;
	}

	/*
	 * public Legajo getLegajo() { return legajo; }
	 * 
	 * public void setLegajo(Legajo legajo) { this.legajo = legajo; }
	 */

}

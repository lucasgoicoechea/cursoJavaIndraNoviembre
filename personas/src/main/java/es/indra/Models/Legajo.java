package es.indra.Models;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import javax.persistence.OneToOne;

import javax.persistence.Table;

@Entity
@Table
public class Legajo {

	@Id
	@GeneratedValue
	int id;

	protected int nroLegajo;

	protected String caratula;

	@OneToOne

	Persona persona;

	public int getNroLegajo() {

		return nroLegajo;

	}

	public void setNroLegajo(int nroLegajo) {

		this.nroLegajo = nroLegajo;

	}

	public String getCaratula() {

		return caratula;

	}

	public void setCaratula(String caratula) {

		this.caratula = caratula;

	}

}
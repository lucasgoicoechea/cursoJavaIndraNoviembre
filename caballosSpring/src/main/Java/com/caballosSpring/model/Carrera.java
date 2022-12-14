package com.caballosSpring.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations Hibernate provides JPA implementation
 * 
 * @author pankaj
 *
 */
@Entity
@Table(name = "CARRERAS")
public class Carrera {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numCorredoresMax;
	private Date fecha;
	private String lugar;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumCorredoresMax() {
		return numCorredoresMax;
	}

	public void setNumCorredoresMax(int numCorredoresMax) {
		this.numCorredoresMax = numCorredoresMax;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	@Override
	public String toString() {
		return "Carrera [id=" + id + ", numCorredoresMax=" + numCorredoresMax + ", fecha=" + fecha + ", lugar=" + lugar
				+ "]";
	}
}

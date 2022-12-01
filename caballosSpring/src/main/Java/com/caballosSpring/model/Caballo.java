package com.caballosSpring.model;

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
@Table(name = "CABALLOS")
public class Caballo {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numero;
	private String color;
	private String propietario;
	private long velocidadMedia;
	private int anioNacimiento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public long getVelocidadMedia() {
		return velocidadMedia;
	}

	public void setVelocidadMedia(long velocidadMedia) {
		this.velocidadMedia = velocidadMedia;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	@Override
	public String toString() {
		return "Caballo [id=" + id + ", numero=" + numero + ", color=" + color + ", propietario=" + propietario
				+ ", velocidadMedia=" + velocidadMedia + ", anioNacimiento=" + anioNacimiento + "]";
	}
}

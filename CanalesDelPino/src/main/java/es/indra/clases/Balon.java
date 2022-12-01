package es.indra.clases;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BALON")
public class Balon {

	@Id
	@Column(name="identificador")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String identificador;
	
	private String modelo;
	
	private double dimension;

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getDimension() {
		return dimension;
	}

	public void setDimension(double dimension) {
		this.dimension = dimension;
	}

	@Override
	public String toString() {
		return "Balon [identificador=" + identificador + ", modelo=" + modelo + ", dimension=" + dimension + "]";
	}

	public void inflar(double cantidad) {
		this.dimension += cantidad;
	}
	
	

}

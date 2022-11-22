package es.indra.cursoJava.entidades;

import java.util.Date;

public class Paleta extends CorteCerdo{

	public Paleta(String nombrePaleta, String raza, Date fechaDeCaducidad, boolean estaRico) {
		super(raza, fechaDeCaducidad, estaRico);
		this.nombrePaleta = nombrePaleta;
	}

	protected String nombrePaleta;

	public String getNombrePaleta() {
		return nombrePaleta;
	}

	public void setNombrePaleta(String nombrePaleta) {
		this.nombrePaleta = nombrePaleta;
	}
	
}

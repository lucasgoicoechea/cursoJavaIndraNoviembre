package es.indra.cursoJava.entidades;

import java.util.Date;

public class Solomillo extends CorteCerdo{

	public Solomillo(String nombreSolomillo, String raza, Date fechaDeCaducidad, boolean estaRico) {
		super(raza, fechaDeCaducidad, estaRico);
		this.nombreSolomillo = nombreSolomillo;
	}

	protected String nombreSolomillo;

	public String getNombreSolomillo() {
		return nombreSolomillo;
	}

	public void setNombreSolomillo(String nombreSolomillo) {
		this.nombreSolomillo = nombreSolomillo;
	}
	
}

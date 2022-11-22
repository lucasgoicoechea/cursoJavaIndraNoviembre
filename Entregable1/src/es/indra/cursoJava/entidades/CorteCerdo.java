package es.indra.cursoJava.entidades;

import java.util.Date;

public class CorteCerdo {
	protected Date fechaDeCaducidad = new Date();
	protected String raza;
	protected boolean estaRico;
	
	public CorteCerdo(String raza, Date fechaDeCaducidad, boolean estaRico) {
		this.raza = raza;
		this.fechaDeCaducidad = fechaDeCaducidad;
		this.estaRico = estaRico;
	}
	
	protected void sabor() {
		if(estaRico)
			System.out.print("Sabe bien");
	}
}

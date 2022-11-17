package es.indra.cursoJava.models;

import es.indra.cursoJava.models.interfaces.ICorteCerdo;

/*
 * comentario de bloque
 */
public abstract class CorteCerdo implements ICorteCerdo {

	protected int kilos;

	protected String nombreCorte = "Corte de Cerdo";

	/**
	 * @return retorna un int cnol os kilos de la pieza
	 **/
	public int getKilos() {
		return kilos;
	}

	public void setKilos(int kilos) {
		this.kilos = kilos;
	}

	public String getNombreCorte() {
		return nombreCorte;
	}

	public void setNombreCorte(String nombreCorte) {
		this.nombreCorte = nombreCorte;
	}

}

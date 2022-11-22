package es.indra.cursoJava.entidades;

public class Jamon extends CorteCerdo{
	
	private int numSerie;

	public Jamon(String nombre, int numero, String fecha) {
		super(nombre, numero, fecha);
		// TODO Auto-generated constructor stub
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
}

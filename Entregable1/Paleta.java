package es.indra.cursoJava.entidades;

public class Paleta extends CorteCerdo {
	
	private int numSerie;

	public Paleta(String nombre, int numero, String fecha) {
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

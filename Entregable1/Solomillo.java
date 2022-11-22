package es.indra.cursoJava.entidades;

public class Solomillo extends CorteCerdo{

	private int peso;

	public Solomillo(String nombre, int numero, String fecha) {
		super(nombre, numero, fecha);
		// TODO Auto-generated constructor stub
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}

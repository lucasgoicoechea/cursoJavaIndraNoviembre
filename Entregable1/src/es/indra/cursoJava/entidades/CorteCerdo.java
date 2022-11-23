package es.indra.cursoJava.entidades;

public class CorteCerdo {
	protected int pesocerdo;
	protected static int ncajas = 4;
	
	public static int quitar_carne(int pesocerdo, int cantidad) {
		return pesocerdo-cantidad;
	}
	
}

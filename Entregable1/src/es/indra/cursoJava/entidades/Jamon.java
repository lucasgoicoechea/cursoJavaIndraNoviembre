package es.indra.cursoJava.entidades;

public class Jamon extends CorteCerdo{
	protected int lonchas = 40;
	
	public static void main(String[] args) {
		int ppal = quitar_carne(500, 450);
		for(int i = 0; i <= ncajas; i++) {
			System.out.println("Cargando la caja " + i + " con " + ppal + " gramos de jamon");
		}
	}
}

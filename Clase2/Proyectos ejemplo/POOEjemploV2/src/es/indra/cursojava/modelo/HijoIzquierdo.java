package es.indra.cursojava.modelo;

public class HijoIzquierdo extends Padre {
	
	protected int hijos = 0;
	
	@Override
	public String toString() {
		return super.toString() + " y soy Hijo Izquierdo";
	}
}

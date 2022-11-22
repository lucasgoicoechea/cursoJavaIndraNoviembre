package es.indra.cursoJava.entidades;

public class Jamon extends CorteCerdo{

	
	int precio;
	
	public Jamon(String origen,String alimentacion,int precio) {
		super(origen, alimentacion);
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void etiqueta() {
		System.out.println("Jamon: "+descripcionCerdo()+", cuesta "+precio);
	}
}

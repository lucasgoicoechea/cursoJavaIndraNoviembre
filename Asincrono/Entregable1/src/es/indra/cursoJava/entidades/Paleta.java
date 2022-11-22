package es.indra.cursoJava.entidades;

public class Paleta extends CorteCerdo{
	
	int ancho;
	
	public Paleta(String origen,String alimentacion,int ancho) {
		super(origen, alimentacion);
		this.ancho = ancho;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void etiqueta() {
		System.out.println("Paleta: "+descripcionCerdo()+", es de "+ancho+"cm de ancho");
	}

}

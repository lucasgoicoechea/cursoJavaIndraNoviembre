package es.indra.cursoJava.entidades;

public class Solomillo extends CorteCerdo{

	int largo;
	
	public Solomillo(String origen,String alimentacion,int largo) {
		super(origen, alimentacion);
		this.largo = largo;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public void etiqueta() {
		System.out.println("Solomillo: "+descripcionCerdo()+", es de "+largo+"cm de largo");
	}
}

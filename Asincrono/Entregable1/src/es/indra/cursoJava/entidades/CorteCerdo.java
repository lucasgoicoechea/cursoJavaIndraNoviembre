package es.indra.cursoJava.entidades;

public class CorteCerdo {

	String origen;
	String alimentacion;
	
	
	public CorteCerdo(String origen, String alimentacion) {
		super();
		this.origen = origen;
		this.alimentacion = alimentacion;
	}


	public String getorigen() {
		return origen;
	}


	public void setorigen(String origen) {
		this.origen = origen;
	}


	public String getAlimentacion() {
		return alimentacion;
	}


	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}


	public String descripcionCerdo() {
		return "Este cerdo comia: "+alimentacion +" y proviene de: "+origen;
	}
}

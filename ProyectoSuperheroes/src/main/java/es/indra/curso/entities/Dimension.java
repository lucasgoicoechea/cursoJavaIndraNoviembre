package es.indra.curso.entities;

public class Dimension {
	private float alto;
	private float ancho;
	private float profundidad;
	
	
	public Dimension() {
		this.alto=0;
		this.ancho=0;
		this.profundidad=0;
	}
	
	public Dimension(float alto, float ancho, float profundidad) {
		this.alto=alto;
		this.ancho=ancho;
		this.profundidad=profundidad;
	}

	
	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public float getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}
	
	public double getVolumen() {
		double volumen=alto*ancho*profundidad;
		return volumen;
	}
	
	public String toString(){
		String mensaje="La dimension es "+getVolumen();
		return mensaje;	
	}
	
	
}

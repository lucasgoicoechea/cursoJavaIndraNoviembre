package es.indra.curso.figurasuperheroes;

import lombok.Data;

@Data
public class Dimension {
	
	double alto;
	double ancho;
	double profundidad;
	
	public Dimension() {
		alto = 0;
		ancho = 0;
		profundidad = 0;
	}
	
	public double getVolumen() {
		double volumen = alto*ancho*profundidad;
		return volumen;
	}

}

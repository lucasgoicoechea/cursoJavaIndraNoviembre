package es.indra.curso.figurasuperheroes;

import lombok.Data;

@Data
public class Superheroe {
	
	private String nombre;
	private String descripcion;
	private boolean capa;
	
	public Superheroe (String nombre) {
		this.nombre = nombre;
		descripcion = "";
		capa = false;
	}
	
	
}

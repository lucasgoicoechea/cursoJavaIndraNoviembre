package es.indra.CursoJava.Figuras;

import lombok.Data;

@Data
public class Superheroe {
	protected String Nombre;
	protected String Descripcion;
	protected boolean Capa;
	
	
	public Superheroe(String nombre) {
		this.Nombre = nombre;
		this.Descripcion = null;
		this.Capa = false;
		
	}
	
	public String toString() {
		return "El superheroe se llama " + Nombre + " es " + Descripcion + " ¿Usa capa?: " + Capa;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public boolean isCapa() {
		return Capa;
	}

	public void setCapa(boolean capa) {
		Capa = capa;
	}
	
}

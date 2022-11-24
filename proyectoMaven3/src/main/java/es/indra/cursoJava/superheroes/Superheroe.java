package es.indra.cursoJava.superheroes;

public class Superheroe {

	protected String nombre;
	protected String descripcion = "";
	protected boolean capa = false;
	
	public Superheroe(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isCapa() {
		return capa;
	}

	public void setCapa(boolean capa) {
		this.capa = capa;
	}
	
	@Override
	public String toString() {
		return (nombre + descripcion + capa);
	}
	
}

package es.indra.cursoJava.entidades.miembros;

import es.indra.cursoJava.entidades.interfaces.IParticipante;

public abstract class Miembro implements IParticipante {
	
	protected String nombre;
	
	protected String rol;
	
	public Miembro() {
		
	}
	
	public Miembro(String nombre, String rol) {
		this.setNombre(nombre);
		this.setRol(rol);
	}

	public abstract String getNombreYRol();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	public String presentarse() {
		return "hola soy el jugaddor " + this.nombre;
	}

}

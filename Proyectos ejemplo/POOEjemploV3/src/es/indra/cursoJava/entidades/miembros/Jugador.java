package es.indra.cursoJava.entidades.miembros;

public class Jugador extends Miembro {
	
	public Jugador() {
		this.setNombre("Jugador construido por constructor");
	}
	
	public Jugador(String nombre, String rol) {
		super(nombre, rol);
	}

	@Override
	public String getNombreYRol() {
		return this.nombre + ", es: " + this.rol;
	}
}

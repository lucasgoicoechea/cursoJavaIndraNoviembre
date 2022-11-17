package es.indra.cursoJava.entidades.miembros;

public class JugadorSuplente extends Miembro {
	
	public JugadorSuplente() {
		this.setNombre("Jugador construido por constructor");
	}
	
	public JugadorSuplente(String nombre, String rol) {
		super(nombre, rol);
	}

	@Override
	public String getNombreYRol() {
		return "SUPLENTE:" + this.nombre + ", es: " + this.rol;
	}
}

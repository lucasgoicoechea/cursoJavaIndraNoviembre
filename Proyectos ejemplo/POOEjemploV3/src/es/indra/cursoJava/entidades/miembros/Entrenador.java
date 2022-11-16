package es.indra.cursoJava.entidades.miembros;

public class Entrenador extends Miembro {


	public Entrenador(String nombre, String rol) {
		super(nombre,rol);
		this.setRol("Entrenador");
	}

	@Override
	public String getNombreYRol() {
		return null;
	}

	public String soyElCoach() {
		return "soy el coach";
	}
	
	@Override
	public String presentarse() {
		return "hola soy el entrenador" + this.nombre;
	}
}

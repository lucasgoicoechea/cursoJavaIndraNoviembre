package es.indra.curso.clases;

public class Corredor {

	private String nombre;
	private int velocidad;
	private int ditancia;
	
	
	public Corredor(String nombre, int velocidad, int ditancia) {
		super();
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.ditancia = ditancia;
	}

	
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public int getDitancia() {
		return ditancia;
	}


	public void setDitancia(int ditancia) {
		this.ditancia = ditancia;
	}
	
	
	
	
}

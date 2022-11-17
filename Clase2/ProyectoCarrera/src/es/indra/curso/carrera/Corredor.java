package es.indra.curso.carrera;

public class Corredor {


	protected String nombre;
	protected int velocidad;
	protected int distancia;
	
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
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	public Corredor(String nombre, int velocidad, int distancia) {
		super();
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.distancia = distancia;
	}
	
	
}
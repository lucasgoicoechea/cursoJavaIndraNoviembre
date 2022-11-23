package es.indra.atletismo;

public class Corredor {
	// Me creo las variables
	private String nombre;
	private int velocidad;
	private int distancia;
	
	// Me creo el acceso a las variables ( Source -> Getters and Setters)
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
	
	
}

package es.indra.curso.entities;

import java.util.Date;

public class Pelicula {

	/*atributos*/
	int anioEstreno;
	boolean disponible;
	int duracion;
	Date fechaIngreso;
	String nombre;
	String tituloOriginal;
	
	
	
	
	public int getAnioEstreno() {
		return anioEstreno;
	}
	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTituloOriginal() {
		return tituloOriginal;
	}
	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}
	
	
	/*comportamiento logico funcional*/
	public boolean estaDisponible() {
		return isDisponible();
	}
	
	
	public boolean estaEnCartelera() {
		return fechaIngreso.before(new Date());
	}
	
	public String[] mostrarFuncionesHabilitados() {
		return null;
	}
	
	public int calcularDuracionEnFuncion() {
		return 60;
	}
	
	
}

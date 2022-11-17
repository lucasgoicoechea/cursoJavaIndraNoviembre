package es.indra.curso.entities;

import java.util.Date;

public class Pelicula {

	
	/* propiedades o atributos*/
	private int anioEstreno = 2022;
	private boolean disponible=true;
	private int duracion =60; //duracion en minutos
	private Date fechaIngreso= new Date();
	private String nombre= "Sin titulo";
	private String tituloOriginal="Alien";
	
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
	
	/* Comportamientos o metodos */
	public boolean estaDisponible() {
		return isDisponible();
	}
	
	public boolean estaEnCartelera() {
		return this.fechaIngreso.before(new Date());
	}
	
	public String[] mostrarFuncionesHabilitadas() {
		return null;
	}
	
	public int calcularDuracionEnFUncion() {
		return 60;
	}
}

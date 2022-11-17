package es.indra.curso.entities;

import java.util.Date;

public class Pelicula {
	
	int anioEstreno = 2022;
	boolean disponible = true;
	int duracion = 60; //minutos
	Date fechaIngreso = new Date();
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
	
	
	public int calcularDuracionEnFuncion() {
		return duracion;
	}
	
	public boolean estaDisponible() {
		return disponible;
	}
	
	public boolean estaEnCartelera() {
		return fechaIngreso;
	}
	
	public String[] mostrarFuncionesHabilitadas() {
		return nombre;
	}
}

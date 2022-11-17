package main;

import java.util.Date;

public class Pelicula {
	private int añoEstreno;
	private boolean disponible;
	private int duracion;
	private Date fechaIngreso;
	private String nombre;
	private String tituloOriginal;
	
	public int getAñoEstreno() {
		return añoEstreno;
	}
	public void setAñoEstreno(int añoEstreno) {
		this.añoEstreno = añoEstreno;
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
	
	
}

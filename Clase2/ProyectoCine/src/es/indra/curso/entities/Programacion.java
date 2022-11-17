package es.indra.curso.entities;

import java.util.Date;

public class Programacion {

	Date fechaHoraCreada= new Date();
	Date fechaInicio= new Date();
	Date fechaFin= new Date();
	
	
	public Date getFechaHoraCreada() {
		return fechaHoraCreada;
	}
	public void setFechaHoraCreada(Date fechaHoraCreada) {
		this.fechaHoraCreada = fechaHoraCreada;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public boolean estaCompleta() {
		return false;
	}
	public boolean estaIniciadaFuncion() {
		return false;
	}
	public boolean estaVigente(){
		return false;
	}
	public String[] mostrarProgramacion() {
		return null;
	}
}

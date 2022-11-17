package es.indra.curso.entities;

import java.util.Date;

public class Programacion {
	
	Date fechaFin;
	Date fechaHoraCreada;
	Date fechaInicio;
	
	
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
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
	
	
	public boolean estaCompleta() {
		return true;
	}
	
	public boolean estaIniciadaFuncion() {
		return true;
	}
	
	public boolean estaVigente() {
		return true;
	}
	
	public String mostrarProgramacion() {
		return null;
	}

}

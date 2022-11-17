package es.indra.curso.entities;

import java.util.Date;

public class Programacion {

	private Date fechaFin = new Date();
	private Date fechaHoraCreada = new Date();
	private Date fechaInincio = new Date();
	
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
	public Date getFechaInincio() {
		return fechaInincio;
	}
	public void setFechaInincio(Date fechaInincio) {
		this.fechaInincio = fechaInincio;
	}
	
	public boolean estaCompleta() {
		//varaible
		return true;
	}
	public boolean estaIniciadaFuncion() {
		//varaible
		return true;
	}
	public boolean estaVigente() {
		//varaible
		return true;
	}
	public void mostrarProgramacion() {
		
	}
}

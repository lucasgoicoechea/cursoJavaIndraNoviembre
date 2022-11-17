package es.indra.curso.clases;

import java.util.Date;

public class Programacion {
	
	//Declaracion de variables
	private Date fechaFin;
	private Date fechaInicio;
	private Date fechaHoraCreada;
	
	//Constructor de la clase
	public Programacion(Date fechaFin, Date fechaInicio) {
		this.fechaFin = fechaFin;
		this.fechaInicio = fechaInicio;
		this.fechaHoraCreada = new Date();
	}
	
	//Metodos
	public boolean estaCompleta() {
		if((this.fechaFin != null) & (this.fechaInicio != null) & (this.fechaHoraCreada != null)){
			return true;
		}
		return false;
	}
	
	public boolean estaIniciadaFuncion() {
		
		if (this.fechaInicio.before(new Date())) {
			return true;
		}
		return false;
	}
	
	public boolean estaVigente(){
		
		if(this.fechaFin.before(new Date())) {
			return true;
		}
		return false;
	}
	
	public String mostrarProgramacion() {
		return "Programacion [fechaFin=" + fechaFin + ", fechaInicio=" + fechaInicio + "]";
	}

	//Metodos de acceso a los datos
	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaHoraCreada() {
		return fechaHoraCreada;
	}

	public void setFechaHoraCreada(Date fechaHoraCreada) {
		this.fechaHoraCreada = fechaHoraCreada;
	}
	
	

}

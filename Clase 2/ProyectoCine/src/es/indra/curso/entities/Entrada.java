package es.indra.curso.entities;

import java.util.Date;

public class Entrada {

	Date fechaHoraFuncion= new Date();
	Date fechaHoraVenta= new Date();
	int precioCobrado;
	int ticketNro;
	
	public Date getFechaHoraFuncion() {
		return fechaHoraFuncion;
	}
	public void setFechaHoraFuncion(Date fechaHoraFuncion) {
		this.fechaHoraFuncion = fechaHoraFuncion;
	}
	public Date getFechaHoraVenta() {
		return fechaHoraVenta;
	}
	public void setFechaHoraVenta(Date fechaHoraVenta) {
		this.fechaHoraVenta = fechaHoraVenta;
	}
	public int getPrecioCobrado() {
		return precioCobrado;
	}
	public void setPrecioCobrado(int precioCobrado) {
		this.precioCobrado = precioCobrado;
	}
	public int getTicketNro() {
		return ticketNro;
	}
	public void setTicketNro(int ticketNro) {
		this.ticketNro = ticketNro;
	}
	
	public boolean estaAnulada() {
		return false;
	}
	
}

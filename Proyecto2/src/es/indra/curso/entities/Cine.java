package es.indra.curso.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cine {

	private String direccion;
	private Date fechaInauguracion = new Date();
	private String nombre;
	private int precioEntrada;
	
	protected List<HoraFuncion> horariosFunciones = new ArrayList<>();
	
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaInauguracion() {
		return fechaInauguracion;
	}

	public void setFechaInauguracion(Date fechaInauguracion) {
		this.fechaInauguracion = fechaInauguracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	
	public void mostrarCine() {
		
	}
	
	public void mostrarInfoHorarioFuncion() {
		
	}
}

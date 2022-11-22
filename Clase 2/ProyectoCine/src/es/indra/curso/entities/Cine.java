package es.indra.curso.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cine {

	protected String direccion;
	protected Date fechaInauguracion = new Date();
	protected String nombre;
	protected BigDecimal precioEntrada;
	List<Funcion> horariosFunciones = new ArrayList<>();

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

	public BigDecimal getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(BigDecimal precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public String mostrarCine() {
		return this.nombre;
	}

	public int[] mostrarInfoHorariosFuncion() {
		return null;
	}
}

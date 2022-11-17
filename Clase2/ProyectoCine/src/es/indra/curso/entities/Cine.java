package es.indra.curso.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cine {

	protected String direccion;
	protected int fechaInauguracion;
	protected String nombre;
	protected BigDecimal precioEntrada;
	List<Funcion> horariosFunciones = new ArrayList<>();
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getFechaInauguracion() {
		return fechaInauguracion;
	}

	public void setFechaInauguracion(int fechaInauguracion) {
		this.fechaInauguracion = fechaInauguracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(float precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public String mostrarCine() {
		return direccion;
	}

	public String mostrarInfoHorariosFuncion() {
		return null;
	}

}

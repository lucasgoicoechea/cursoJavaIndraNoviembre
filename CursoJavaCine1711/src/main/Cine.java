package main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cine {
	private String direccion;
	private Date fechaInauguracion;
	private String nombre;
	private BigDecimal precioEntrada;
	private List<Funcion> horariosFunciones = new ArrayList<>();

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

	public BigDecimal precioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(BigDecimal horaInicio) {
		this.precioEntrada = horaInicio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

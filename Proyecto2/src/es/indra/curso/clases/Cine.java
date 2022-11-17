package es.indra.curso.clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cine {
	
	//Declaracion de variable
	private String direccion;
	private Date fechaInauguracion;
	private String nombre;
	private double precioEntrada;
	//private List<HorarioFuncion> horarioFuncion= new ArrayList();
	//private List<Programacion> programacion= new ArrayList();

	
	//Constructor de la clase
	public Cine(String direccion, Date fechaInauguracion, String nombre, double precioEntrada) {
		this.direccion = direccion;
		this.fechaInauguracion = fechaInauguracion;
		this.nombre = nombre;
		this.precioEntrada = precioEntrada;
	}

	
	//Metodos
	public String mostrarCine() {
		String cine;
		cine = "Nombre: " + this.nombre + " Direccion: " + this.direccion;
		return cine;
	}
	
	public String[] mostrarInfoHorariosFuncion() {
		return null;
	}
	
	//Metodos de acceso a los datos
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

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	

}

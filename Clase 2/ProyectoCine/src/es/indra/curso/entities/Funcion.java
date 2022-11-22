package es.indra.curso.entities;

import java.util.Date;

public class Funcion {

	
	protected String diaSemana;
	protected int duracion;
	protected int horaInicio;
	protected int numero;
	protected Cine miCine;
	
	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	//METODOS
	
	public boolean calcularDisponibilidad() {
		return false;
	}
	
	public int capacidadSala() {
		return 100;
	}
	
	public boolean estaEnCurso() {
		return false;
	}
	
	public Date mostrarDiaHora() {
		return null;
	}
}

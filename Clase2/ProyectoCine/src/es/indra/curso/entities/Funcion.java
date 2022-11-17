package es.indra.curso.entities;

import java.util.Date;

public class Funcion {
	
	protected String diaSemana;
	protected int duracion;
	protected String horaInicio;
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
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public boolean calcularDisponibilidad() {
		return true;
	}
	
	public int capacidadSala() {
		return numero;
	}
	
	public boolean estaEnCurso() {
		return true;
	}

	public Date mostrarDiaHora() {
		return null;
	}
}

package main;

import java.util.Date;

public class Funcion {
	private enum diasSemana {
		Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo
	};

	private diasSemana diaSemana;
	private int duracion;
	private String horaInicio;
	private int numero;
	private Cine cine;

	public diasSemana getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(diasSemana diaSemana) {
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

	public Cine getCine() {
		return cine;
	}

	public void setCine(Cine cine) {
		this.cine = cine;
	}

}

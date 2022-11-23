package es.indra.curso.entities;

import java.util.Date;

public class HorarioFuncion {
	
	
	protected String diaDeSemana;
	protected int duracionIntervalo;
	protected int duracionPublicidad;
	protected boolean esTrasnoche;
	protected Date horaPrimeraFuncion;
	protected Date horaUltimaFuncion;

	public String getDiaDeSemana() {
		return diaDeSemana;
	}

	public void setDiaDeSemana(String diaDeSemana) {
		this.diaDeSemana = diaDeSemana;
	}

	public int getDuracionIntervalo() {
		return duracionIntervalo;
	}

	public void setDuracionIntervalo(int duracionIntervalo) {
		this.duracionIntervalo = duracionIntervalo;
	}

	public int getDuracionPublicidad() {
		return duracionPublicidad;
	}

	public void setDuracionPublicidad(int duracionPublicidad) {
		this.duracionPublicidad = duracionPublicidad;
	}

	public boolean isEsTrasnoche() {
		return esTrasnoche;
	}

	public void setEsTrasnoche(boolean esTrasnoche) {
		this.esTrasnoche = esTrasnoche;
	}

	public Date getHoraPrimeraFuncion() {
		return horaPrimeraFuncion;
	}

	public void setHoraPrimeraFuncion(Date horaPrimeraFuncion) {
		this.horaPrimeraFuncion = horaPrimeraFuncion;
	}

	public Date getHoraUltimaFuncion() {
		return horaUltimaFuncion;
	}

	public void setHoraUltimaFuncion(Date horaUltimaFuncion) {
		this.horaUltimaFuncion = horaUltimaFuncion;
	}

	public Date mostrarHorarioFuncion() {

	}
}

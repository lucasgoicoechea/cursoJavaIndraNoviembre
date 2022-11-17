package es.indra.curso.entities;

public class HoraFuncion {

	private String diaDeSemana;
	private int duracionIntervalo;
	private int duracionPublicidad;
	private boolean esTrasnoche;
	private int horaPrimeraFuncion;
	private int horaUltimaFuncion;
	
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
	public int getHoraPrimeraFuncion() {
		return horaPrimeraFuncion;
	}
	public void setHoraPrimeraFuncion(int horaPrimeraFuncion) {
		this.horaPrimeraFuncion = horaPrimeraFuncion;
	}
	public int getHoraUltimaFuncion() {
		return horaUltimaFuncion;
	}
	public void setHoraUltimaFuncion(int horaUltimaFuncion) {
		this.horaUltimaFuncion = horaUltimaFuncion;
	}
	
	public void mostrarHorariosFuncion() { 
		
	}
	
}

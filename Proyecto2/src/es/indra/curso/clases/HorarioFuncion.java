package es.indra.curso.clases;

//import java.time.LocalDateTime;

public class HorarioFuncion {
	
	//Declaracion variables
	private String diaDeSemana;
	private int duracionIntervalo;
	private int duracionPublicidad;
	private boolean esTrasnoche;
	//private LocalDateTime horaPrimeraFuncion;
	private String horaPrimeraFuncion;
	//private LocalDateTime horaUltimaFuncion;
	private String horaUltimaFuncion;
	
	//Constructor de la clase
	public HorarioFuncion(String diaDeSemana, int duracionIntervalo, int duracionPublicidad, boolean esTrasnoche,
			String horaPrimeraFuncion, String horaUltimaFuncion) {
		this.diaDeSemana = diaDeSemana;
		this.duracionIntervalo = duracionIntervalo;
		this.duracionPublicidad = duracionPublicidad;
		this.esTrasnoche = esTrasnoche;
		this.horaPrimeraFuncion = horaPrimeraFuncion;
		this.horaUltimaFuncion = horaUltimaFuncion;
	}
	
	//Metodos
	public String mostrarHorarioFuncion() {
		return "HorarioFuncion [diaDeSemana=" + diaDeSemana + ", duracion=" + duracionIntervalo
				+ ", horaPrimeraFuncion=" + horaPrimeraFuncion + ", horaUltimaFuncion=" + horaUltimaFuncion + "]";
	}

	//Metodos de acceso a los datos
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
	public String getHoraPrimeraFuncion() {
		return horaPrimeraFuncion;
	}
	public void setHoraPrimeraFuncion(String horaPrimeraFuncion) {
		this.horaPrimeraFuncion = horaPrimeraFuncion;
	}
	public String getHoraUltimaFuncion() {
		return horaUltimaFuncion;
	}
	public void setHoraUltimaFuncion(String horaUltimaFuncion) {
		this.horaUltimaFuncion = horaUltimaFuncion;
	}
	
	

}

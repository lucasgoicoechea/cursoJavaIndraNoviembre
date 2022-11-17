import java.util.Date;

public class HorarioFuncion {
	private String diaSemana;
	private int duracionIntervalo;
	private int duracionPublicidad;
	private boolean esTrasnoche;
	private Date primeraFuncion = new Date();
	private Date ultimaFuncion = new Date();
	
	public HorarioFuncion(String diaSemana, int duracionIntervalo, int duracionPublicidad, boolean esTrasnoche,
			Date primeraFuncion, Date ultimaFuncion) {
		super();
		this.diaSemana = diaSemana;
		this.duracionIntervalo = duracionIntervalo;
		this.duracionPublicidad = duracionPublicidad;
		this.esTrasnoche = esTrasnoche;
		this.primeraFuncion = primeraFuncion;
		this.ultimaFuncion = ultimaFuncion;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
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

	public Date getPrimeraFuncion() {
		return primeraFuncion;
	}

	public void setPrimeraFuncion(Date primeraFuncion) {
		this.primeraFuncion = primeraFuncion;
	}

	public Date getUltimaFuncion() {
		return ultimaFuncion;
	}

	public void setUltimaFuncion(Date ultimaFuncion) {
		this.ultimaFuncion = ultimaFuncion;
	}
	
	/* mostrarHorarioFuncion */
}

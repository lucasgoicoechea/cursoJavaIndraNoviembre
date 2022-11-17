
public class Funcion 
{

	private String diaDeSemana;
	private int duracionIntervalo;
	private int duracionPublicidad;
	private boolean esTrasnoche;
	private String horaPrimeraFuncion;
	private String horaUltimaFuncion;
	private Cine cine;

	public Funcion(String diaDeSemana, int duracionIntervalo,
			int duracionPublicidad, boolean esTrasnoche,
			String horaPrimeraFuncion, String horaUltimaFuncion) {
		this.diaDeSemana=diaDeSemana;
		this.duracionIntervalo=duracionIntervalo;
		this.duracionPublicidad=duracionPublicidad;
		this.esTrasnoche=esTrasnoche;
		this.horaPrimeraFuncion=horaPrimeraFuncion;
		this.horaUltimaFuncion=horaUltimaFuncion;
	}

	//Getters y setters
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

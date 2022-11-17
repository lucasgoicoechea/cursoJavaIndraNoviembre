
import java.util.Date;

public class Pelicula 
{

	private int anoEstreno=2022;
	private boolean disponible;
	private int duracion=60;;
	private Date fechaIngreso=new Date();
	private String nombre;
	private String tituloOriginal;

	public int getAnoEstreno() {
		return anoEstreno;
	}
	public void setAnoEstreno(int anoEstreno) {
		this.anoEstreno = anoEstreno;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTituloOriginal() {
		return tituloOriginal;
	}
	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public boolean estaDisponible()
	{
		return this.disponible;
	}

	public boolean estaEnCartelera() {
		return this.fechaIngreso.before(new Date());
	}

	public String[] mostrarFuncionesHabilitadas() {
		return null;
	}

	public int calcularDuracionEnFuncion() {
		return 60;
	}
}

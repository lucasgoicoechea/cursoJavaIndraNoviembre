import java.util.Date;

public class Pelicula {
	//PROPIEDADES
	
	private int anioEstreno = 2022;
	private boolean disponible = true;
	private int duracion = 60;
	private Date fechaDeEstreno = new Date();
	private String nombre = "Sin titulo";
	private String tituloOriginal;
	
	public int getAnioEstreno() {
		return anioEstreno;
	}
	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
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
	public Date getFechaDeEstreno() {
		return fechaDeEstreno;
	}
	public void setFechaDeEstreno(Date fechaDeEstreno) {
		this.fechaDeEstreno = fechaDeEstreno;
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
	
	public boolean estaDisponible(){
		return this.isDisponible();
	}
	
	public boolean estaEnLaCartelera() {
		return this.getFechaDeEstreno().before(new Date());
	}
	
}

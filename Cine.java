import java.util.ArrayList;
import java.util.List;

public class Cine 
{

	private String direccion;
	private String fechaInauguracion;
	private String nombre;
	private int precioEntrada;
	List<Funcion> horariosFunciones = new ArrayList<>();


	public Cine(String direccion,String fechaInauguracion,String nombre,int precioEntrada) {
		this.direccion=direccion;
		this.fechaInauguracion=fechaInauguracion;
		this.nombre=nombre;
		this.precioEntrada=precioEntrada;
	}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getFechaInauguracion() {
		return fechaInauguracion;
	}
	public void setFechaInauguracion(String fechaInauguracion) {
		this.fechaInauguracion = fechaInauguracion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecioEntrada() {
		return precioEntrada;
	}
	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}


}

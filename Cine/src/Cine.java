import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cine {
	protected String direccion;
	protected Date fechaInaguracion = new Date();
	protected String nombre;
	protected double precioEntrada;
	List<Funcion> horariosFunciones = new ArrayList<>();
	
	public Cine(String direccion, Date fechaInaguracion, String nombre, double precioEntrada) {
		super();
		this.direccion = direccion;
		this.fechaInaguracion = fechaInaguracion;
		this.nombre = nombre;
		this.precioEntrada = precioEntrada;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaInaguracion() {
		return fechaInaguracion;
	}

	public void setFechaInaguracion(Date fechaInaguracion) {
		this.fechaInaguracion = fechaInaguracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	
	public String mostrarCine() {
		return this.getNombre();
	}
	
	/*public Date mostrarInfoHorariosProgramacion() {
		
	}*/
	
}

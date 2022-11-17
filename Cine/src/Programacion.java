import java.util.Date;

public class Programacion {
	private Date fechaFin = new Date();
	private Date fechaHoraCreada = new Date();
	private Date fechaInicio = new Date();
	
	public Programacion(Date fechaFin, Date fechaHoraCreada, Date fechaInicio) {
		super();
		this.fechaFin = fechaFin;
		this.fechaHoraCreada = fechaHoraCreada;
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaHoraCreada() {
		return fechaHoraCreada;
	}

	public void setFechaHoraCreada(Date fechaHoraCreada) {
		this.fechaHoraCreada = fechaHoraCreada;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	/*public boolean estaCompleta() {
		
	}*/
	
	public boolean estaIniciadaFuncion() {
		return this.getFechaInicio().after(new Date());
	}
	
	public boolean estaVigente() {
		return (this.getFechaInicio().after(new Date()) && this.getFechaFin().before(new Date()));
	}
	
	/* mostrar programacion */
}

package idelpino;

public class Superheroe {
	private String nombre;
	private String descripcion;
	private boolean capa;
	
	public Superheroe(String nombre) {
		super();
		this.descripcion = "";
		this.capa = false;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isCapa() {
		return capa;
	}

	public void setCapa(boolean capa) {
		this.capa = capa;
	}

	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", descripcion=" + descripcion + ", capa=" + capa + "]";
	}
	
	
}

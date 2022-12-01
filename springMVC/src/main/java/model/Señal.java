package model;

public class Señal {

	private int id;
	private String nombre;
	private String tipo;
	private String informacion;
	
	public Señal(String nombre, String tipo, String informacion) 
	{
		this.nombre = nombre;
		this.tipo = tipo;
		this.informacion = informacion;
	}

	public int getId() {
		return id;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getInformacion() {
		return informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}
	
}

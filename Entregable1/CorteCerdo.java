package es.indra.cursoJava.entidades;

public class CorteCerdo {
	
	private String nombre;
	private int numero;
	private String fecha;
	
	public CorteCerdo(String nombre,int numero,String fecha) {
		this.nombre=nombre;
		this.numero=numero;
		this.fecha=fecha;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	

}

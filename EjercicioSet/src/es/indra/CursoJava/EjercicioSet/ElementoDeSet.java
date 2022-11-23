package es.indra.CursoJava.EjercicioSet;

public class ElementoDeSet {
	private int orden;
	private double precio;
	private String serial;
	
	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}
	
	public String toString(double precio, String serial) {
		return orden + " " + precio + " " + serial + ", ";
	}
}

package es.indra.cursoJava.clases;

public class ElementoSet {
	
	private int orden = 0;
	private double precio = 0;
	private String serial = "";
	
	public ElementoSet(double precio, String serial) {
		super();
		this.precio = precio;
		this.serial = serial;
	}

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
	
	
	@Override
	public String toString() {
		return "ElementoSet [orden=" + orden + ", precio=" + precio + ", serial=" + serial + "]";
	}

}


public class ElementoDeSet {
	
	int orden;
	double precio;
	String serial;
	
	public ElementoDeSet(double precio, String serial) {
		this.precio=precio;
		this.serial=serial;
	}
	@Override
	public String toString() {
		return "ElementoDeSet [orden=" + orden + ", precio=" + precio + ", serial=" + serial + "]";
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

}

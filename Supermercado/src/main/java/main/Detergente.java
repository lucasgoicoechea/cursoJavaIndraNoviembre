package main;

public class Detergente implements ConDescuento{
	private String marca;
	private double precio;
	private double descuento;
	
	public Detergente(String marca, double precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void setDescuento(double des) {
		this.descuento = des;
	}
	
	public double getDescuento() {
		return this.descuento;
	}
	public double getPrecioDescuento() {
		return this.getPrecio() - this.getDescuento();
	}

	@Override
	public String toString() {
		return "Detergente [marca=" + marca + ", precio=" + precio + ", descuento=" + descuento + "]";
	}
	
}

package main;

import java.time.LocalDate;

public class Cereales implements EsAlimento{
	private String marca;
	private double precio;
	private String tipo;
	private LocalDate caducidad;
	
	public Cereales(String marca, double precio, String tipo) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.tipo = tipo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setCaducidad(LocalDate fc) {
		this.caducidad = fc;
	}

	public LocalDate getCaducidad() {
		return this.caducidad;
	}

	public int getCalorias() {
		String tipo = this.getTipo();
		if(tipo.equals("Cereal"))
			return 5;
		if(tipo.equals("Maiz"))
			return 8;
		if(tipo.equals("Trigo"))
			return 12;
		return 15;
	}

	@Override
	public String toString() {
		return "Cereales [marca=" + marca + ", precio=" + precio + ", tipo=" + tipo + ", caducidad=" + caducidad + "]";
	}
	
}

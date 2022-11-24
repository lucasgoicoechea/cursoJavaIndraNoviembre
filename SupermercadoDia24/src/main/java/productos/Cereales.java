package productos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import interfaces.IEsAlimento;
import main.producto;

public class Cereales extends producto implements IEsAlimento {
	private String marca;
	private double precio;
	private String tipoCereal;
	
	private LocalDate caducidad;
	private int calorias;

	public Cereales(String marca, double precio, String tipoCereal) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.tipoCereal = tipoCereal;
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

	public String getTipoCereal() {
		return tipoCereal;
	}

	public void setTipoCereal(String tipoCereal) {
		this.tipoCereal = tipoCereal;
	}

	public void setCaducidad(LocalDate caducidad) {
		this.caducidad = caducidad;

	}

	public LocalDate getCaducidad() {
		return caducidad;
	}

	public int getCalorias() {
		return calorias;
	}
	
	public String toString() {
		String toRet = "Este producto es de la marca " + marca;
		toRet = toRet + "\nTiene un precio de " + precio + "€";
		toRet = toRet + "\nEs del tipo " + tipoCereal + " Litros";
		toRet = toRet + "\nCaduca el día " + caducidad.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		toRet = toRet + "\nContiene " + calorias + " Kcal";
		return toRet;
	}
}

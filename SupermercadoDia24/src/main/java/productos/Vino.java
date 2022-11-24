package productos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import interfaces.IConDescuento;
import interfaces.IEsAlimento;
import interfaces.IEsLiquido;
import main.producto;

public class Vino extends producto implements IEsLiquido,IConDescuento,IEsAlimento{
	private String marca;
	private String tipo;
	private double gradosAlcohol;
	private double precio;
	
	private double descuento;
	private double volumen;
	private String tipoEnvase;
	private LocalDate caducidad;
	
	public Vino(String marca, String tipo, double gradosAlcohol, double precio) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.gradosAlcohol = gradosAlcohol;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getGradosAlcohol() {
		return gradosAlcohol;
	}

	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
		
	}

	public double getDescuento() {
		return descuento;
	}

	public double getPrecioDescuento() {
		return precio * descuento;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
		
	}

	public double getVolumen() {
		return volumen;
	}

	public void setTipoEnvase(String tipoEnvase) {
		this.tipoEnvase = tipoEnvase;
		
	}

	public String getTipoEnvase() {
		return tipoEnvase;
	}
	
	public int getCalorias() {
		return (int)gradosAlcohol * 10;
	}
	
	public void setCaducidad(LocalDate caducidad) {
		this.caducidad = caducidad;
		
	}

	public LocalDate getCaducidad() {
		return caducidad;
	}
	
	public String toString() {
		String toRet = "Este producto es de la marca " + marca;
		toRet = toRet + "\nTiene un precio de " + precio + "€";
		toRet = toRet + "\nEs del tipo " + tipo;
		toRet = toRet + "\nTiene una graduación de " + gradosAlcohol + "º";
		toRet = toRet + "\nTiene un descuento de " + descuento + " %";
		toRet = toRet + "\nCaduca el día " + caducidad.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		toRet = toRet + "\nTiene un volumen de " + volumen + " Litros";
		toRet = toRet + "\nTiene un tipo de envase " + tipoEnvase;
		return toRet;
	}

}

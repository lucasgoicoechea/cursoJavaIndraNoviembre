package models;



import java.time.LocalDate;

import interfaces.ConDescuento;
import interfaces.EsLiquido;
import lombok.Data;

@Data
public class Vino extends Producto implements ConDescuento, EsLiquido{
	
	private String marca, tipoVino, tipoEnvase;
	private double  precio, volumen, descuento;
	private int calorias, grados;
	
	
	public void setVolumen(double v) {
		// TODO Auto-generated method stub
		this.volumen = v;
	}

	public double getVolumen() {
		// TODO Auto-generated method stub
		return this.volumen;
	}

	public void setTipoEnvase(String env) {
		// TODO Auto-generated method stub
		this.tipoEnvase = env;
	}

	public String getTipoEnvase() {
		// TODO Auto-generated method stub
		return this.tipoEnvase;
	}

	public void setDescuento(double des) {
		// TODO Auto-generated method stub
		this.descuento = des;
	}

	public double getDescuento() {
		// TODO Auto-generated method stub
		return this.descuento;
	}

	public double getPrecioDescuento() {
		// TODO Auto-generated method stub
		return this.precio - this.descuento;
	}

	public Vino(String marca, String tipoVino, int grados, double precio, double volumen, double descuento, String tipoEnvase) {
		super();
		this.marca = marca;
		this.tipoVino = tipoVino;
		this.grados = grados;
		this.calorias = this.grados * 10;
		this.precio = precio;
		this.volumen = volumen;
		this.descuento = descuento;
		this.tipoEnvase = tipoEnvase;
	}

	public void setCaducidad(LocalDate fc) {
		// TODO Auto-generated method stub
		
	}

	public LocalDate getCaducidad() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
		
	
}

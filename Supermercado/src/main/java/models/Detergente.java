package models;

import java.time.LocalDate;

import interfaces.ConDescuento;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class Detergente extends Producto implements ConDescuento{
	
	private String marca;
	private double precio;
	private double descuento;
	private int calorias = 0; 
	
	public Detergente(String marca, double precio) {
		super();
		this.marca = marca;
		this.precio = precio;
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

	public void setCaducidad(LocalDate fc) {
		// TODO Auto-generated method stub
		
	}

	public LocalDate getCaducidad() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}

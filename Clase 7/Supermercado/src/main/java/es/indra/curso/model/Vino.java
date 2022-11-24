package es.indra.curso.model;

import java.time.LocalDate;

import es.indra.curso.interfaces.*;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Vino extends Producto implements EsLiquido,ConDescuento,EsAlimento{

	private String marca;
	private String tipo;
	private int grados;
	private double precio;
	
	
	public void setVolumen(double v) {
		// TODO Auto-generated method stub
		
	}

	public double getVolumen() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setTipoEnvase(String env) {
		// TODO Auto-generated method stub
		
	}

	public String getTipoEnvase() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDescuento(double des) {
		// TODO Auto-generated method stub
		
	}

	public double getDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getPrecioDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setCaducidad(LocalDate fc) {
		// TODO Auto-generated method stub
		
	}

	public LocalDate getCaducidad() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCalorias() {
		
		return this.grados*10;
	}

	
}

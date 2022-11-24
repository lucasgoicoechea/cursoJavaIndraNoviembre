package es.indra.CursoJava.Models;

import java.time.LocalDate;

import es.indra.CursoJava.Interfaces.EsAlimento;
import lombok.Data;

@Data
public class Cereales extends Producto implements EsAlimento {
	
	private String marca, tipoCereal;
	private int calorias;
	private double precio;
	private LocalDate caducidad;
	
	public Cereales(String marca, String tipoCereal, double precio, LocalDate caducidad) {
		super();
		this.marca = marca;
		this.tipoCereal = tipoCereal;
		
		if(this.tipoCereal == "espelta") {
			this.calorias = 5;
		}else if(this.tipoCereal == "maiz") {
			this.calorias = 8;
		}else if(this.tipoCereal == "trigo"){
			this.calorias = 12;
		}else {
			this.calorias = 15;
		}
		this.caducidad = caducidad;
		this.precio = precio;
	}

	public void setCaducidad(LocalDate fc) {
		this.caducidad = fc;
		
	}

	public LocalDate getCaducidad() {
		// TODO Auto-generated method stub
		return this.caducidad;
	}
	
	
		
}

package es.indra.curso.Productos;

import java.time.LocalDate;

import es.indra.cursoJava.interfaces.EsAlimento;

public class Cereales extends Alimento implements EsAlimento{

	private String marca;
	private double precio;
	private String TipoCereal;
	private int calorias;
	
	public Cereales(String marca,double precio,String TipoCereal) {
		this.marca=marca;
		this.precio=precio;
		this.TipoCereal=TipoCereal;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public double calcularCalorias() {
		if(this.TipoCereal.equals("espelta")) {
			return this.calorias=5;
		}
		else if(this.TipoCereal.equals("maiz")) {
			return this.calorias=8;
		}
		else if(this.TipoCereal.equals("trigo")) {
			return this.calorias=12;
		}
		else {
			return this.calorias=15;
		}
	}

	@Override
	public String toString() {
		return "Cereales [marca=" + marca + ", precio=" + precio + ", TipoCereal=" + TipoCereal + "]";
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
		return TipoCereal;
	}

	public void setTipoCereal(String tipoCereal) {
		TipoCereal = tipoCereal;
	}

	public void setCaducidad() {
		// TODO Auto-generated method stub

	}

	public LocalDate getCaducidad() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCalorias() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}

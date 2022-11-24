package es.indra.curso.Productos;

import es.indra.cursoJava.interfaces.ConDescuento;
import es.indra.cursoJava.interfaces.EsLiquido;

public class Detergente implements ConDescuento,EsLiquido{

	private String marca;
	private double precio;

	public Detergente(String marca,double precio) {
		this.marca=marca;
		this.precio=precio;
	}

	@Override
	public String toString() {
		return "Detergente [marca=" + marca + ", precio=" + precio + "]";
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


}

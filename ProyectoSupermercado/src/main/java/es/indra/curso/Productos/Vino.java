package es.indra.curso.Productos;

import es.indra.cursoJava.interfaces.ConDescuento;
import es.indra.cursoJava.interfaces.EsLiquido;

public class Vino extends Alimento implements EsLiquido,ConDescuento{

	private String marca;
	private String tipoVino;
	private double gradosAlcohol;
	private double precio;
	private double calorias;

	public Vino(String marca,String tipoVino,double gradosAlcohol,double precio) {
		this.marca=marca;
		this.tipoVino=tipoVino;
		this.gradosAlcohol=gradosAlcohol;
		this.precio=precio;
	}

	public double calcularCalorias() {
		 return calorias=gradosAlcohol*10;
	}

	@Override
	public String toString() {
		return "Vino [marca=" + marca + ", tipoVino=" + tipoVino + ", gradosAlcohol=" + gradosAlcohol + ", precio="
				+ precio + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipoVino() {
		return tipoVino;
	}

	public void setTipoVino(String tipoVino) {
		this.tipoVino = tipoVino;
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

	


}

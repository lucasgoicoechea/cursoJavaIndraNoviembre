package es.indra.cursoJava.entidades;

public class Jamon extends CorteCerdo{

	private String tipoJamon = "";

	public Jamon(double precio, double gramos, String tipoJamon) {
		super(precio, gramos);
		this.tipoJamon = tipoJamon;
	}

	public String getTipoJamon() {
		return tipoJamon;
	}

	public void setTipoJamon(String tipoJamon) {
		this.tipoJamon = tipoJamon;
	}

	
	public void imprimirJamon() {
		System.out.println("Ha comprado un jamon " + this.tipoJamon + 
				" con el precio " + this.precio + " y ha pedido " + this.gramos + " gramos");
	}
	
}

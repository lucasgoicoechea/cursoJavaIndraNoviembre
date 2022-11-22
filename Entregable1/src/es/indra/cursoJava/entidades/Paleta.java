package es.indra.cursoJava.entidades;

public class Paleta extends CorteCerdo{
	
	private String tipoPaleta = "";

	public Paleta(double precio, double gramos, String tipoPaleta) {
		super(precio, gramos);
		this.tipoPaleta = tipoPaleta;
	}

	public String getTipoPaleta() {
		return tipoPaleta;
	}

	public void setTipoPaleta(String tipoPaleta) {
		this.tipoPaleta = tipoPaleta;
	}
	
	public void imprimirPaleta() {
		System.out.println("Ha comprado una paleta " + this.tipoPaleta + 
				" con el precio " + this.precio + " y ha pedido " + this.gramos + " gramos");
	}

	

}

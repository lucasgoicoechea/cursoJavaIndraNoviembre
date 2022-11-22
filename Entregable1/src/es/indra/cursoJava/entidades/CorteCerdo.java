package es.indra.cursoJava.entidades;

public class CorteCerdo {
	
	protected double precio = 0;
	protected double gramos = 0;
	

	public CorteCerdo(double precio, double gramos) {
		super();
		this.precio = precio;
		this.gramos = gramos;
	}
	
	
	
	public CorteCerdo(double precio) {
		super();
		this.precio = precio;
	}



	public double getGramos() {
		return gramos;
	}

	public void setGramos(double gramos) {
		this.gramos = gramos;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double calcularPrecio() {
		return precio * (gramos/1000);
	}
	

}

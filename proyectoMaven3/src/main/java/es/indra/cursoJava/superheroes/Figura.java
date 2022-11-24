package es.indra.cursoJava.superheroes;

public class Figura {

	protected String codigo;
	protected double precio;
	
	Superheroe superheroe;
	Dimension dimension;
	
	public Figura(String codigo, double precio, Dimension dimension, Superheroe superheroe) {
		this.codigo = codigo;
		this.precio = precio;
		this.superheroe = superheroe;
		this.dimension = dimension;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Superheroe getSuperheroe() {
		return superheroe;
	}

	public void setSuperheroe(Superheroe superheroe) {
		this.superheroe = superheroe;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	@Override
	public String toString() {
		return (codigo + precio + superheroe + dimension);
	}
	
	public void subirPrecio(double cantidad) {
		this.precio += cantidad;
	}
	
}

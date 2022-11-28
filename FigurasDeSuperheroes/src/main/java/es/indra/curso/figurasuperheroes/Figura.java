package es.indra.curso.figurasuperheroes;

import lombok.Data;

@Data
public class Figura {
	
	String codigo;
	double precio;
	Superheroe superheroe;
	Dimension dimension;
	
	public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimension) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.superheroe = superheroe;
		this.dimension = dimension;
	}
	
	public void subirPrecio(double cantidad) {
		precio += cantidad;
	}

}

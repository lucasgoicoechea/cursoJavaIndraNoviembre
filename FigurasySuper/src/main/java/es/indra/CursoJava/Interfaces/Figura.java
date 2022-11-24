package es.indra.CursoJava.Interfaces;

import es.indra.CursoJava.Models.Dimension;
import es.indra.CursoJava.Models.Superheroe;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Figura{
	protected String Codigo;
	protected double Precio;
	Superheroe superheroe = new Superheroe(null);
	Dimension dimensiones = new Dimension();
	
	public Figura(String Codigo, double Precio, Superheroe superheroe, Dimension dimensiones) {
		this.Codigo = Codigo;
		this.Precio = Precio;
		this.superheroe = superheroe;
		this.dimensiones = dimensiones;
	}
	
	public String toString() {
		return " La figura de " + superheroe.toString() + " de dimensiones " + dimensiones.toString() +
				" con codigo " + Codigo + " cuesta " + Precio;
	}
	
	public void subirPrecio(double cantidad) {
		 this.Precio += cantidad;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public Superheroe getSuperheroe() {
		return superheroe;
	}

	public void setSuperheroe(Superheroe superheroe) {
		this.superheroe = superheroe;
	}

	public Dimension getdimensiones() {
		return dimensiones;
	}

	public void setdimensiones(Dimension dimensiones) {
		this.dimensiones = dimensiones;
	}
	
}

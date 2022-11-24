package es.indra.cursoJava.superheroes;

import java.util.ArrayList;

public class Coleccion {
	protected String nombreColeccion;
	protected ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
	
	public Coleccion(String nombreColeccion) {
				
	}

	public String getNombreColeccion() {
		return nombreColeccion;
	}

	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}

	public void aniadirFigura(Figura figura) {
		listaFiguras.add(figura);
	}
	
	public void subirPrecio(double cantidad, String id) {
		for (Figura figura : listaFiguras) {
			if(figura.getCodigo() == id) {
				figura.precio += cantidad;
				break;
			}
		}
	}
	
	@Override
	public String toString() {
		String resultado = null;
		for (Figura figura : listaFiguras) {
			resultado += figura.toString();
		}
		return resultado;
	}
	
	public String conCapa() {
		String resultado = null;
		for (Figura figura : listaFiguras) {
			if(figura.getSuperheroe().capa == true) {
				resultado += figura.toString();
			}
		}
		return resultado;
	}
	
	public Figura masValioso() {
		Figura aux = listaFiguras.get(0);
		for (Figura figura : listaFiguras) {
			if(figura.precio > aux.precio)
				aux = figura;
		}
		return aux;
	}
	
	public double getValorColeccion() {
		double total = 0;
		for (Figura figura : listaFiguras) {
			total += figura.precio;
		}
		return total;
	}
	
	public double getVolumenColeccion() {
		double total = 200;
		for (Figura figura : listaFiguras) {
			total += figura.getDimension().getVolumen();
		}
		return total;
	}
	
}

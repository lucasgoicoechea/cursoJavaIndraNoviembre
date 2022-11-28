package es.indra.curso.entities;

import java.util.ArrayList;

public class Coleccion {
	private String nombreColeccion;
	ArrayList<Figura> listaFiguras;

	public Coleccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
		listaFiguras = new ArrayList<Figura>();
	}

	public String getNombreColeccion() {
		return nombreColeccion;
	}

	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}

	public void añadirFigura(Figura p_fig) {
		listaFiguras.add(p_fig);
	}

	public void subirPrecio(double cantidad, String id) {

		for (Figura fig : listaFiguras) {
			if (fig.getCodigo().equals(id)) {
				fig.setPrecio(fig.getPrecio() + cantidad);
			}
		}
	}

	public String conCapa() {
		String toRet = "";

		for (Figura fig : listaFiguras) {
			if (fig.getSuperheroe().isCapa()) {
				toRet += fig.getSuperheroe().getNombre() + "\n ";
			}
		}
		return toRet;
	}
	
	public String masValioso() {
		String figuraAlta="";
		double precioAlto=0;
		
		for (Figura fig : listaFiguras) {
			if(fig.getPrecio()>precioAlto) {
				precioAlto = fig.getPrecio();
				figuraAlta = fig.getSuperheroe().getNombre();
			}
		}
		return figuraAlta;
	}

	public double getValorColeccion() {
		double sumaTotal = 0;

		for (Figura fig : listaFiguras) {
			sumaTotal += fig.getPrecio();
		}
		return sumaTotal;
	}

	public double getVolumenColeccion() {
		double volumenTotal = 0;

		for (Figura fig : listaFiguras) {
			volumenTotal += fig.getDimension().getVolumen();
		}
		return volumenTotal + 200;
	}

}

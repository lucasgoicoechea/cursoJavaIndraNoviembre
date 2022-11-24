package es.indra.CursoJava.Interfaces;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Coleccion {
	protected String nombreColeccion;
	protected ArrayList <Figura> listaFiguras= new ArrayList<Figura>();
	
	public Coleccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
		this.listaFiguras = new ArrayList<Figura>();
	}
	
	public void aniadirFigura(Figura fig) {
		listaFiguras.add(fig);
	}
	
	public void subirPrecio(double cantidad, String id) {
		int indice;
		try {
			indice = listaFiguras.indexOf(id);
			listaFiguras.get(indice).subirPrecio(cantidad);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public String toString() {
		return "La coleccion " + nombreColeccion + "tiene " + listaFiguras.toString();
	}
	
	public String conCapa() {
		StringBuilder capa = new StringBuilder ();
		for(Figura fig: listaFiguras) {
			if(fig.getSuperheroe().isCapa()) {
				capa.append(fig.toString());
			}
		}
		return capa.toString();
	}
	
	public Figura masValioso() {
		double valor = 0;
		Figura figaux = null;
		for(Figura fig: listaFiguras) {
			if(fig.getPrecio()> valor) {
				figaux = fig;
				valor = fig.getPrecio();
			}
		}
		return figaux;
	}
	
	public double getValorColeccion() {
		double valor = 0;
		
		for(Figura fig: listaFiguras) {	
				valor += fig.getPrecio();
		}
		return valor;
	}
	
	public double getVolumenColeccion() {
		double valor = 0;
		
		for(Figura fig: listaFiguras) {	
				valor += fig.getdimensiones().getVolumen();
		}
		return valor + 200;
	}
	
}

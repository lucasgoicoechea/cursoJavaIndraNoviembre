package idelpino;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {
	private String nombreColeccion;
	private List<Figura> listaFiguras;
	public Coleccion(String nombreColeccion) {
		super();
		this.nombreColeccion = nombreColeccion;
		this.listaFiguras =  new ArrayList();
	}
	public String getNombreColeccion() {
		return nombreColeccion;
	}
	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}
	
	public void anadirFigura(Figura figura) {
		this.listaFiguras.add(figura);
	}
	
	public void subirPrecio(double cantidad, String id) {
		for(Figura i : this.listaFiguras) {
			if(i.getCodigo().equals(id)) {
				i.setPrecio(cantidad + i.getPrecio());
			}
		}
	}
	
	@Override
	public String toString() {
		String texto = "";
		for(Figura i : this.listaFiguras) {
			texto += i.toString() + "\n";
		}
		return texto;
	}
	
	public String conCapa() {
		String texto = "";
		for(Figura i : this.listaFiguras) {
			if(i.getHeroe().isCapa()) {
				texto += i.getHeroe().getNombre() + ", ";
			}
		}
		return texto;
	}
	
	public Figura masValioso() {
		Figura masValiosa = this.listaFiguras.get(0);
		for (Figura i : this.listaFiguras) {
			if(i.getPrecio() > masValiosa.getPrecio()) {
				masValiosa = i;
			}
		}
		return masValiosa;
	}
	
	public double getValorColeccion() {
		double aux = 0;
		for (Figura i : this.listaFiguras) {
			aux += i.getPrecio();
		}
		return aux;
	}
	
	public double getVolumenColeccion() {
		double aux = 200;
		for (Figura i : this.listaFiguras) {
			aux += i.getDimensiones().getVolumen();
		}
		return aux;
	}
}

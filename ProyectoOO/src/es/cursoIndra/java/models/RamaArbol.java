package es.cursoIndra.java.models;

import java.util.ArrayList;
import java.util.List;

public class RamaArbol implements ElementoArbol{

	protected List<HojasArbol> listaHojas = new ArrayList();
	private int ancho;
	private int largo;
	private int espesor;	

	public RamaArbol(List<HojasArbol> listaHojas, int ancho, int largo, int espesor) {
		super();
		this.listaHojas = listaHojas;
		this.ancho = ancho;
		this.largo = largo;
		this.espesor = espesor;
	}

	public List<HojasArbol> getListaHojas() {
		return listaHojas;
	}

	public void setListaHojas(List<HojasArbol> listaHojas) {
		this.listaHojas = listaHojas;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getEspesor() {
		return espesor;
	}

	public void setEspesor(int espesor) {
		this.espesor = espesor;
	}

	@Override
	public int largo() {
		// TODO Auto-generated method stub
		return largo;
	}

	@Override
	public int ancho() {
		// TODO Auto-generated method stub
		return ancho;
	}

	@Override
	public int espesor() {
		// TODO Auto-generated method stub
		return espesor;
	}
	
	
	
}

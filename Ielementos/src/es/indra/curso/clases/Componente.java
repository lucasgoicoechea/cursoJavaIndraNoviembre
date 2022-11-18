package es.indra.curso.clases;

import java.util.*;

public class Componente extends elemento {
	
	public Componente() {
		super();
		// TODO Auto-generated constructor stub
	}

	private List<elemento> elementos = new ArrayList<>();

	public List<elemento> getElementos() {
		return elementos;
	}

	public void setElementos(List<elemento> elementos) {
		this.elementos = elementos;
	}
	
}

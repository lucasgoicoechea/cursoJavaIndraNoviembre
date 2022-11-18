package es.cursoIndra.java.models;

import java.util.ArrayList;
import java.util.List;

public class TroncoArbol {
	
	protected List<RamaArbol> listaRamas = new ArrayList();

	public List<RamaArbol> getListaRamas() {
		return listaRamas;
	}
	
	public TroncoArbol(List<RamaArbol> listaRamas) {
		super();
		this.listaRamas = listaRamas;
	}

	public void setListaRamas(List<RamaArbol> listaRamas) {
		this.listaRamas = listaRamas;
	}
	
}

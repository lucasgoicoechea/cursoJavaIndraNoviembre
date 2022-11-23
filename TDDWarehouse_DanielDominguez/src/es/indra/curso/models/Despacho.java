package es.indra.curso.models;

import es.indra.curso.utilities.Estado;

public class Despacho {
	
	protected Pedido pedido = new Pedido();

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public int registrarDespachaje(Pedido unPedido) {
		
		unPedido.setEstado(Estado.DESPACHADO);
		return 0;
	}
}

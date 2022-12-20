package es.indra.curso.models;

import es.indra.curso.utilities.Estado;

public class Entrega {

	protected Pedido pedido = new Pedido();

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public int realizarEntrega(Pedido unPedido) {
		
		unPedido.setEstado(Estado.ENTREGADO);
		return 0;
	}
	
}

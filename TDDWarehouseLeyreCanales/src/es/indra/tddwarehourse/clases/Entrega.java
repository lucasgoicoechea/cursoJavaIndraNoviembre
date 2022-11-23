package es.indra.tddwarehourse.clases;

public class Entrega {
	
	Pedido pedido;

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public int realizarEntrega(Pedido unPedido) {
		this.pedido = unPedido;
		return 1;
	}

}

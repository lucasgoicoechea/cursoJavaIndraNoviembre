package es.indra.curso.model;

public class Entrega {

	private Pedido pedido;

	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido=pedido;
	}

	public int realizarEntrega(Pedido unPedido) {
		pedido=unPedido;
		pedido.setEstado(Estado.ENTREGADO);
		return 0;
	}

}

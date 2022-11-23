package es.indra.curso.model;

public class Entrega {

	private Pedido pedido;
	public Pedido getPedido(){
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public int realizarEntrega(Pedido unPedido) {
		this.pedido=unPedido;
		unPedido.setEstado(Estado.ENTREGADO);
		return 1;
	}
}

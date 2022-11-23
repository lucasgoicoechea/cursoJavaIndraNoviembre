package es.indra.tddwarehourse.models;

public class Entrega {
	private Pedido pedido;
	
	public Pedido getPedido() {
		return this.pedido;
	}
	
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public int realizarEntrega(Pedido pedido) {
		this.pedido = pedido;
		return 0;
	}
}

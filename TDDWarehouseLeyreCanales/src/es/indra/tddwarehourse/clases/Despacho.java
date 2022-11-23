package es.indra.tddwarehourse.clases;



public class Despacho {

	Pedido pedido;

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public int registrarDespachaje(Pedido unPedido) {
		this.pedido = unPedido;
		return 1;
	}
	
	
	
}

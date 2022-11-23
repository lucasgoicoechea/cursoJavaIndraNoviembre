package es.indra.curso.model;

public class Despacho {
	
	private Pedido pedido;
	
	public Pedido getPedido() {
		return this.pedido;
	}
	
	public void setPedido(Pedido pedido) {
		this.pedido=pedido;
	}

	public int registrarDespachaje(Pedido unPedido) {
		pedido=unPedido;
		pedido.setEstado(Estado.DESPACHADO);
		return 0;
	}
}

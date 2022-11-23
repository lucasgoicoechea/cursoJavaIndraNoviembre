package entidad;

public class Entrega {
	
	Pedido pedido;

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public int realizarEntrega(Pedido unPedido) {
		setPedido(unPedido);
		unPedido.setEstado(Estado.ENTREGADO);
		return unPedido.unidades;
	}


}

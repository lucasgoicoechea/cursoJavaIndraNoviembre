package TDDWharehouse;

public class Entrega {
	Pedido pedido;

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public int realizarEntrega(Pedido p_pedido) {
		this.pedido = p_pedido;
		p_pedido.setEstado(Estado.ENTREGADO);
		return 0;
	}
}

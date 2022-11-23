package entidad;

public class Despacho {
	
	Pedido pedido;

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public int registrarDespachaje(Pedido unPedido) {
		setPedido(unPedido);
		unPedido.setEstado(Estado.DESPACHADO);
		return unPedido.unidades;
	}


}

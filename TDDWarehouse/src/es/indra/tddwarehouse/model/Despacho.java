package es.indra.tddwarehouse.model;

import es.indra.tddwarehouse.model.Pedido.Estado;

public class Despacho {
	
	Pedido pedido;

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public int registrarDespachaje(Pedido _pedido) {
		this.pedido=_pedido;
		_pedido.setEstado(Estado.DESPACHADO);
		return 0;
	}

}

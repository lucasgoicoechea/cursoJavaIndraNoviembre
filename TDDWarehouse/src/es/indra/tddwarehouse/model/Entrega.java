package es.indra.tddwarehouse.model;

import es.indra.tddwarehouse.model.Pedido.Estado;

public class Entrega {
 private Pedido pedido;

public Pedido getPedido() {
	return pedido;
}

public void setPedido(Pedido pedido) {
	this.pedido = pedido;
}
 

public int realizarEntrega(Pedido _pedido) {
	this.pedido=_pedido;
	_pedido.setEstado(Estado.ENTREGADO);
	return 0;
}
}

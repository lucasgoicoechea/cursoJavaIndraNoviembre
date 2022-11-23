package es.indra.tddwarehouse.models;

import es.indra.tddwarehouse.models.Pedido.Estado;

public class Despacho {
	Pedido pedido;
	
	public Pedido getPedido() {
		return pedido;
	}
	
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public int registrarDespachaje(Pedido p_pedido){
		
		this.pedido = p_pedido;
		p_pedido.setEstado(Estado.DESPACHADO);
		return 0;
	}
}

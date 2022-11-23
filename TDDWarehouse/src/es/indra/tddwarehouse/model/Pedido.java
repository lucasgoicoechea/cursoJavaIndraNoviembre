package es.indra.tddwarehouse.model;

public class Pedido {

	protected String cliente;
	protected int unidades;
	
	public enum Estado{CREADO,DESPACHADO,ENTREGADO};
	private Estado estado;
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public int generarPedido(String cliente,int unidades) {
	this.cliente=cliente.setEstado(Estado.CREADO);
	}
	
}

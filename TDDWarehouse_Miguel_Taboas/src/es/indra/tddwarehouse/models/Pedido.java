package es.indra.tddwarehouse.models;

public class Pedido {
	private String cliente;
	private int unidades;
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
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public int generarPedido(String p_cliente, int p_unidades) {
		
		estado = Estado.CREADO;
		return 0;
	}
}

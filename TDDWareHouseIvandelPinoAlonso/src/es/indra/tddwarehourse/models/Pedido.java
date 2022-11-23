package es.indra.tddwarehourse.models;

public class Pedido {

	private String cliente;
	private int unidades;
	private Estado estado;
	
	public Pedido(String cliente, int unidades) {
		this.cliente = cliente;
		this.unidades = unidades;
		this.estado = Estado.CREADO;
	}
	
	public Pedido() {};

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
	
	public int generarPedido(String cliente, int unidades) {
		this.estado = estado.CREADO;
		return 0;
	}
	
}

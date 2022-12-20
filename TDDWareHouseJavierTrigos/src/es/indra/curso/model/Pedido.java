package es.indra.curso.model;

public class Pedido {

	private String cliente;
	private int unidades;
	private  Estado estado=Estado.CREADO;

	public String getCliente() {
		return cliente;
	}
	public int getUnidades() {
		return unidades;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public int generarPedido(String cliente, int unidades) {
		return 0;
	}



}

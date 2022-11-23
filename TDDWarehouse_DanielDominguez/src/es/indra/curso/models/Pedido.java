package es.indra.curso.models;

import es.indra.curso.utilities.Estado;

public class Pedido {
	
	protected String cliente;
	protected int unidades;
	protected Estado estado = Estado.CREADO;
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
	
	public int generarPedido(String cliente, int unidades) {
		
		return 0;
	}
	
}

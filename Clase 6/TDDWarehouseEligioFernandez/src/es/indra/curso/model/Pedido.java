package es.indra.curso.model;

public class Pedido {

	public String cliente;
	public int unidades;
	public Estado estado= Estado.CREADO;
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
	public int generarPedido(String cliente,int unidades) {
		return 0;
	}
	public void setEstado( Estado entregado) {
		this.estado = entregado;
	}
	
	
}

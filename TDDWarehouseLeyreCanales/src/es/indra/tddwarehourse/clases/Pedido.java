package es.indra.tddwarehourse.clases;

public class Pedido {

	String cliente;
	int unidades;
	Estado estado;
	
	public int generarPedido(String cliente, int unidades) {
		this.cliente = cliente;
		this.unidades = unidades;
		this.estado = Estado.CREADO;
		
		return 1;
	}

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
	
	
	
	
}

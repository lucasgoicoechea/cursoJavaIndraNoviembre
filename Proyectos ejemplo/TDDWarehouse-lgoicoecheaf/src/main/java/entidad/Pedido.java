package entidad;

public class Pedido {

	String cliente;
	int unidades;
	Estado estado = Estado.CREADO;

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

	public int generarPedido(String cliente, int unidades) throws Exception {
		if (cliente == null)
			throw new Exception("CLIENTE N PUEDE SER NULL");
		return unidades / 5;
	}

	public void setEstado(Estado entregado) {
		this.estado = entregado;		
	}

}

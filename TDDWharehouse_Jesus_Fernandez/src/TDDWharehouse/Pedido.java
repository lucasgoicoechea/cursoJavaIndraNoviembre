package TDDWharehouse;

public class Pedido {
	private int unidades;
	private String cliente;
	private Estado estado;
	
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public int generarPedido(String p_cliente, int p_unidades) {
		estado = Estado.CREADO;
		return 0;
	}
}

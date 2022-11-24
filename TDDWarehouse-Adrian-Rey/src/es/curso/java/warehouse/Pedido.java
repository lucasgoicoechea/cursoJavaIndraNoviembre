package es.curso.java.warehouse;

public class Pedido {
	
	private String cliente;
	private int unidades;
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
	
	public int generarPedido (String cliente, int unidades) {
		return unidades;
	}
}

package entidad;

public class Pedido {

	public int generarPedido(String cliente, int unidades) throws Exception {
		if (cliente == null) 
			throw new Exception("CLIENTE N PUEDE SER NULL");
		return unidades/5;
	}

}

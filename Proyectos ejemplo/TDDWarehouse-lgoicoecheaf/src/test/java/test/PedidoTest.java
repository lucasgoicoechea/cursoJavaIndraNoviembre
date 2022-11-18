package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import entidad.Pedido;

public class PedidoTest {

	Pedido pedido;
	
	@Before
	public void crearInstanciaClase() {
		pedido = new Pedido();
	}
	
	@Test
	public final void caseBase() throws Exception {
		assertEquals("pido 10 proudcotor", 10, pedido.generarPedido("un cliente", 50));
	}
	
	@Test
	public final void failedBase() throws Exception {
		//el metodo de pedido que devuelve algo erroneo
		assertFalse(pedido.generarPedido("un cliente", 50) != 10);
	}
	
	@Test(expected = Exception.class)
	public final void exceptionBase()  throws Exception {
		//el metodo de pedido genera una exeption
		assertEquals("exceptio;n", 0, pedido.generarPedido(null, 0));
	}
	
	@Test
	public final void complexBase() throws Exception {
		int valor = pedido.generarPedido("un cliente", 50);
		assertFalse(valor != 10);
		assertNotEquals(valor, 0);
		assertEquals("pido 10 proudcotor", 10, valor);
	}

}

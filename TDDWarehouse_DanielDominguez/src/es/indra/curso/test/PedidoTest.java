package es.indra.curso.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import es.indra.curso.models.Pedido;

public class PedidoTest {

	@Before
	public void preparacion() {
		Pedido pedido = new Pedido();
	}
	
	@Test
	public void caseBase() throws Exception {
		Assert.assertNotNull(pedido);
	}
	
	@Test 
	public void failedBase() throws Exception {
		Assert.assertNull(pedido);
	}
	
	@Test (expected = Exception.class)
	public void exceptionBase() throws Exception {
		
	}
	
	@Test
	public void complexBase() throws Exception {
		
	}
	
}

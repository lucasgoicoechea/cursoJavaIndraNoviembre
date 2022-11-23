package es.indra.curso.test;

import org.junit.*;

import es.indra.curso.model.*;
public class DespachoTest {

	@Test
	public void caseBase() throws Exception{
		Pedido pedido1 = new Pedido();
		Assert.assertNotEquals(null, pedido1);
	}
	@Test
	public void failedBase() throws Exception{
		Pedido pedido1 = new Pedido();
		Assert.assertEquals(null, pedido1);
	}
	@Test
	public void exceptionBase() throws Exception{
		Pedido pedido1 = new Pedido();
		Assert.assertNotEquals(new Exception(), pedido1.generarPedido("", 0));
	}
	@Test
	public void complexBase() throws Exception{
		Assert.assertEquals(true, true);
	}
	@Before
	public void inicioTest() {
		
	}
}

package es.indra.curso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import es.indra.curso.model.Pedido;

public class PedidoTest {
	
	Pedido pedido= new Pedido();
	Pedido pedido2= new Pedido();
	
	@Before
	public void init() {
		pedido.setCliente("Pedro");
		pedido.setUnidades(2);
		pedido2.setCliente("Marcos");
		pedido2.setUnidades(3);
	}
	
	@Test
	public void caseBase() {
		Assert.assertNotEquals(pedido2, pedido);
	}
	
	@Test
	public void failedBase() {
		
		Assert.assertNotSame(pedido2, pedido);
	}
	
	@Test
	public void exceptionBase() throws Exception{
		Assert.assertNotEquals(new Exception(), pedido.generarPedido("",0));
		}
	
	@Test
	public void complexBase() {
		Assert.assertNotEquals(pedido2, pedido);
		Assert.assertEquals(pedido, pedido);
	}
	

}

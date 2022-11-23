package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import es.indra.tddwarehouse.model.Pedido;

class DespachoTest {

	@Test
	public void caseBase() {
	Pedido pedido1=new Pedido();
	Assert.assertNotEquals(null, pedido1);
	}
	
	@Test
	public void failedBase() {
	Pedido pedido1=new Pedido();
	Assert.assertEquals(null, pedido1);
	}
	
	@Test
	public void exceptionBase() {
	Pedido pedido1=new Pedido();
	Assert.assertNotEquals(new Exception(),pedido1.generarPedido(""));
	}
	

}

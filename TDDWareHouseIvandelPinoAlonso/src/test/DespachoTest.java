package test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import es.indra.tddwarehourse.models.Pedido;

public class DespachoTest {
	
	//Prueba del caso base
	@Test
	public void caseBase() {
		Pedido pedido1 = new Pedido();
		Assert.assertNotEquals(null, pedido1);
	}
	
	//Asert false
	@Test
	public void failedBase() {
		Pedido pedido1 = new Pedido();
		Assert.assertEquals(null, pedido1);
	}
	
	//Caso que genera una excepcion
	@Test
	public void exceptionBase() {
		Pedido pedido1 = new Pedido();
		Assert.assertNotEquals(new Exception(), pedido1.generarPedido("", 0));
	}
	
	//Caso complejo de prueba mas de un assert
	@Test
	public void complexBase() {
		
	}
}

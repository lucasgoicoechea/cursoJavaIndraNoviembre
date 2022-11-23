package test;

import org.junit.Assert;
import org.junit.Test;

import es.indra.tddwarehouse.models.Pedido;

public class DespachoTest implements ITest {
	@Test
	@Override
	public void caseBase() {
		Pedido pedido1 = new Pedido();
		Assert.assertNotEquals(null, pedido1);
	}

	@Test
	@Override
	public void failedBase() {
		Pedido pedido1 = new Pedido();
		Assert.assertEquals(null, pedido1);
	}

	@Test
	@Override
	public void exceptionBase() {
		Pedido pedido1 = new Pedido();

		Assert.assertNotEquals(new Exception(), pedido1.generarPedido("", 0));
	}
}

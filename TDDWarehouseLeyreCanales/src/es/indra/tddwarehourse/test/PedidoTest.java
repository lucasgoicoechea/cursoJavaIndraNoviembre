package es.indra.tddwarehourse.test;



import org.junit.Assert;
import org.junit.Test;

import es.indra.tddwarehourse.clases.*;


public class PedidoTest {
	
	
	
	@Test
    public void caseBase() throws Exception {
		Pedido p1 = new Pedido();
		Assert.assertNotEquals(null, p1);
    }
 
    @Test
    public void failedBase() throws Exception {
    	Pedido p1 = new Pedido();
		Assert.assertEquals(null, p1);
    }


	@Test
    public void exceptionBase() throws Exception {
		Pedido p1 = new Pedido();
		Assert.assertNotEquals(new Exception(), p1.generarPedido("", 0));
    }
    
    @Test
    public void complexBase() throws Exception {
    	Pedido p1 = new Pedido();
    	p1.generarPedido("c1", 1);
    	Assert.assertEquals(1, p1.getUnidades());
    	Assert.assertSame("c1", p1.getCliente());
    	Assert.assertSame(Estado.CREADO, p1.getEstado());
     
    }

}

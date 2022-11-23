package es.indra.tddwarehourse.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

import es.indra.tddwarehourse.clases.Despacho;
import es.indra.tddwarehourse.clases.Entrega;
import es.indra.tddwarehourse.clases.Pedido;

public class EntregaTest {
	
	@Test
    public void caseBase() throws Exception {
		Entrega e1 = new Entrega();
		Assert.assertNotEquals(null, e1);
    }
 
    @Test
    public void failedBase() throws Exception {
    	Entrega e1 = new Entrega();
		Assert.assertEquals(null, e1);
    }

	@Test
    public void exceptionBase() throws Exception {
    	Entrega e1 = new Entrega();
    	Assert.assertNotEquals(new Exception(), e1.realizarEntrega(null));
    }
    
    @Test
    public void complexBase() throws Exception {
    	Entrega e1 = new Entrega();
    	Pedido p1 = new Pedido();
    	p1.generarPedido("c1", 1);
    	e1.realizarEntrega(p1);
    	Assert.assertNotEquals(null, e1);
    	Assert.assertNotEquals(null, e1.getPedido());
    }

}

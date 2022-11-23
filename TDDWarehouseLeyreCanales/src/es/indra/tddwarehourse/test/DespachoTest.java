package es.indra.tddwarehourse.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Assert;

import org.junit.Test;

import es.indra.tddwarehourse.clases.Despacho;
import es.indra.tddwarehourse.clases.Estado;
import es.indra.tddwarehourse.clases.Pedido;

public class DespachoTest {
	
	
	@Test
    public void caseBase() throws Exception {
		Despacho d1 = new Despacho();
		Assert.assertNotEquals(null, d1);
    }
 
    @Test
    public void failedBase() throws Exception {
    	Despacho d1 = new Despacho();
		Assert.assertEquals(null, d1);
    }


	@Test
    public void exceptionBase() throws Exception {
    	Despacho d1 = new Despacho();
    	Assert.assertNotEquals(new Exception(), d1.registrarDespachaje(null));
    }
    
    @Test
    public void complexBase() throws Exception {
    	Despacho d1 = new Despacho();
    	Pedido p1 = new Pedido();
    	p1.generarPedido("c1", 1);
    	d1.registrarDespachaje(p1);
    	Assert.assertNotEquals(null, d1);
    	Assert.assertNotEquals(null, d1.getPedido());
    }

}

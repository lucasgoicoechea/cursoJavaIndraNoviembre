package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.indra.tddwarehouse.model.Pedido;

class PedidoTest {
	 /*@Test
     - caseBase , prueba el caso base
     - failedBase, caso de falla o assert false
     - exceptionBase, caso que genera una exception
     - complexBase, caso complejo prueba mas de 1 assert*/
	
	private Pedido pedido;
	
	@Test
	void caseBase() {
		fail("Not yet implemented");
	}
	
	
	 	
	@Before 
	public void preparacion() { 
		pedido = new Pedido(); }

}
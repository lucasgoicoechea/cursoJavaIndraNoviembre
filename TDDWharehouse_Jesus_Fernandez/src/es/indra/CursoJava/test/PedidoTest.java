package es.indra.CursoJava.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import TDDWharehouse.Pedido;

public class PedidoTest {
	Pedido ped = new Pedido();
	
	@Test
	 public void caseBase() {
		Pedido ped2 = new Pedido();
		assertEquals(ped, ped2); 
	 }
	
	@Test
	 public void failedBase(){
		assertEquals(ped, null); 
	 }
	
	@Test
	 public void exceptionBase(){
		assertNotEquals(new Exception(), ped); 
	 }
	
	@Test
	 public void complexBase(){
		Pedido ped2 = new Pedido();
		assertEquals(ped, ped2); 
		assertNotEquals(ped, null); 
		assertNotEquals(new Exception(), ped);
	 }
}

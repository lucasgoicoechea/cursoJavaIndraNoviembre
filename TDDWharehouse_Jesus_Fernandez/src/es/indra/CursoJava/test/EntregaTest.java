package es.indra.CursoJava.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import TDDWharehouse.Entrega;

public class EntregaTest {
	Entrega ent = new Entrega();
	
	@Test
	 public void caseBase() {
		Entrega ent2 = new Entrega();
		assertEquals(ent, ent2); 
	 }
	
	@Test
	 public void failedBase(){
		assertEquals(ent, null); 
	 }
	
	@Test
	 public void exceptionBase(){
		assertNotEquals(new Exception(), ent); 
	 }
	
	@Test
	 public void complexBase(){
		Entrega ent2 = new Entrega();
		assertEquals(ent, ent2); 
		assertNotEquals(ent, null); 
		assertNotEquals(new Exception(), ent);
	 }
}

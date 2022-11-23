package es.indra.CursoJava.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import TDDWharehouse.Despacho;

public class DespachoTest {
	
	Despacho des = new Despacho();
	@Test
	 public void caseBase() {
		Despacho des2 = new Despacho();
		assertEquals(des, des2); 
	 }
	
	@Test
	 public void failedBase(){
		assertEquals(des, null); 
	 }
	
	@Test
	 public void exceptionBase(){
		assertNotEquals(new Exception(), des); 
	 }
	
	@Test
	 public void complexBase(){
		Despacho des2 = new Despacho();
		assertEquals(des, des2); 
		assertNotEquals(des, null); 
		assertNotEquals(new Exception(), des);
	 }
}

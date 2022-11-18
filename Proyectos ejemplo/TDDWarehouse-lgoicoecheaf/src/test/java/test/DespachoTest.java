package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DespachoTest {
	
	@Before
	public void crearInstanciaClase() {
		
	}

	@Test
	public final void caseBase() {
		assertEquals("pido 10 proudcotor", 10, 10);
	}
	
	@Test
	public final void failedBase() {
		//el metodo de despacho que devuelve algo erroneo
		assertFalse(10 != 10);
	}
	
	@Test(expected = Exception.class)
	public final void exceptionBase()  throws Exception {
		//el metodo de despacho genera una exeption
		//assertEquals("exception", 0, null);
		throw  new Exception();
	}
	
	@Test
	public final void complexBase() {
		assertFalse(10 != 10);
		assertNotEquals(1, 0);
		assertEquals("pido 10 proudcotor", 10, 10);
	}

}

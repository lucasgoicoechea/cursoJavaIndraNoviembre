package calculadoraTest;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora ca;
	
	@Before
	public final void crearCalculadora() {
		System.out.println("CalculadoraTest.crearCalculadora()");
		ca = new Calculadora();  
	}
	
	@After
	public final void borrarCalculadora() {
		System.out.println("CalculadoraTest.borrarCalculadora()");
		ca = null;  
	}
	
	@Test
	public final void testSuma() {		
		//fail(String.valueOf(ca.suma(0, 0)));
		assertEquals("Ha fallado la suma basica", ca.suma(1, 0), 1);
		assertEquals("Ha fallado la suma basica", 1, ca.suma(1, 11000));
	}
	
	@Test
	public final void testSumaNegativosDaNegativos() {		 //whenThen
		//fail(String.valueOf(ca.suma(0, 0)));
		assertEquals("Ha fallado la suma basica", ca.suma(-1, -1), -2);
		assertEquals("Ha fallado la suma basica", -11001, ca.suma(-1, -11000));
	}
	
	@Test
	public final void testSumarizado() { 
		int[] arrnros = {10,20,30};
		int[] xpected = {20,30,40};
		assertArrayEquals(xpected, ca.sumarizado(arrnros, 10));	
		xpected[2] = 0;
		assertArrayEquals(xpected, ca.sumarizado(arrnros, 10));	
		//assumeThat(xpected, ca.sumarizado(arrnros, 10));		
 	}

}

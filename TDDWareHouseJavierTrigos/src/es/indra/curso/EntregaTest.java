package es.indra.curso;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EntregaTest {

	
	@Before
	public void init() {
		
	}
	
	@Test
	public void caseBase() {
		Assert.assertSame(null, null);
	}
	
	@Test
	public void failedBase() {
		
		Assert.assertFalse(false);
		
	}
	
	@Test
	public void exceptionBase() throws Exception{
		assertNotNull(null);
	}
	
	@Test
	public void complexBase() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
	}
	
}

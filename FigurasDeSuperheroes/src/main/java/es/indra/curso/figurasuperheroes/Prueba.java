package es.indra.curso.figurasuperheroes;

import org.junit.*;

public class Prueba {
	
	Coleccion coleccion = new Coleccion("Coleccion de prueba");
	
	@Test
	public void test() {
		Superheroe superheroe1 = new Superheroe("superman");
		Dimension dimension1 = new Dimension();
		Figura figura1 = new Figura("HOLA2", 30, superheroe1, dimension1);
		
		coleccion.añadirFigura(figura1);
		coleccion.añadirFigura(figura1);
		
		Assert.assertEquals((long)60.0, (long)coleccion.getValorColeccion());
	}

}

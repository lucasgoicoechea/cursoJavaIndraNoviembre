package es.indra.cursoJava.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import es.indra.cursoJava.superheroes.Coleccion;
import es.indra.cursoJava.superheroes.Dimension;
import es.indra.cursoJava.superheroes.Figura;
import es.indra.cursoJava.superheroes.Superheroe;

public class TestSuperheroes {

	//Falla
	@Test
	public void shouldDetectErrorAnThrowRuntimeExceptionWhenAPriceIsNegativeInFigura() {
		Dimension dimension = new Dimension(5,5,5);
		Superheroe superheroe = new Superheroe("mauricio");
		Figura figura = new Figura("2", -1, dimension, superheroe);
		Assert.assertTrue(figura.getPrecio()>0);
	}
	
	//Falla
	@Test
	public void shouldDetectErrorAnThrowRuntimeExceptionWhenVolumenParameterIsNegative() {
		Dimension dimension = new Dimension(-5,5,-5);
		Superheroe superheroe = new Superheroe("mauricio");
		Figura figura = new Figura("2", -1, dimension, superheroe);
		Assert.assertTrue(figura.getDimension().getAlto()>0);
		Assert.assertTrue(figura.getDimension().getAncho()>0);
		Assert.assertTrue(figura.getDimension().getProfundidad()>0);
	}
	
	@Test
	public void shouldCalculateTotalPrice() throws Exception {
		Coleccion coleccionprueba = new Coleccion("prueba");
		coleccionprueba.aniadirFigura( new Figura("1", 20, new Dimension(5,5,5), new Superheroe("Jose")));
		coleccionprueba.aniadirFigura(new Figura("2", 30, new Dimension(5,6,19), new Superheroe("Maria")));
		Assert.assertEquals(50, coleccionprueba.getValorColeccion(), 0);
	}
	
	@Test
	public void shouldreturnHighestPriceFigura() throws Exception {
		Coleccion coleccionprueba = new Coleccion("prueba");
		Figura figuraValiosa = new Figura("3", 2000000, new Dimension(5,10,5), new Superheroe("Jose"));
		coleccionprueba.aniadirFigura( new Figura("1", 20, new Dimension(5,5,5), new Superheroe("Jose")));
		coleccionprueba.aniadirFigura(new Figura("2", 30, new Dimension(5,6,19), new Superheroe("Maria")));
		coleccionprueba.aniadirFigura(figuraValiosa);
		Assert.assertEquals(figuraValiosa, coleccionprueba.masValioso());
	}	
}

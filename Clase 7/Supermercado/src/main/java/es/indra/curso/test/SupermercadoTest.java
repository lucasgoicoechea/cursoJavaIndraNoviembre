package es.indra.curso.test;

import java.util.ArrayList;

import org.junit.*;

import es.indra.curso.model.*;

public class SupermercadoTest {

	@Test
	public void caseBase() throws Exception {

		ArrayList<Producto> productos = new ArrayList<Producto>();
		Cereales _cereales = null;
		Vino _vino = null;

		productos.add((Producto) _cereales.builder().tipo("maiz").precio(10).marca("Hacendado").build());//8 calorias
		productos.add((Producto) _cereales.builder().tipo("espelta").precio(15).marca("Froiz").build());//5 calorias
		productos.add((Producto) _cereales.builder().tipo("trigo").precio(12).marca("Froiz").build());//12 calorias
		productos.add((Producto) _vino.builder().tipo("Tinto").marca("Froiz").grados(14).precio(15).build());//140 calorias

		int suma = 0;
		for (Producto prod : productos) {
			suma += prod.getCalorias();
		}

		Assert.assertEquals(165, suma);
	}

}
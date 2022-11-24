package es.indra.cursoJava.main;

import es.indra.cursoJava.superheroes.Coleccion;
import es.indra.cursoJava.superheroes.Dimension;
import es.indra.cursoJava.superheroes.Figura;
import es.indra.cursoJava.superheroes.Superheroe;

public class Main {
	
	public static void main(String args[]) {
		Coleccion coleccionprueba = new Coleccion("prueba");
		
		coleccionprueba.aniadirFigura( new Figura("1", 20, new Dimension(5,5,5), new Superheroe("Jose")));
		coleccionprueba.aniadirFigura(new Figura("2", 30, new Dimension(5,6,19), new Superheroe("Maria")));
		coleccionprueba.aniadirFigura(new Figura("hhhhhhhh", 99.95, new Dimension(10,6,10), new Superheroe("Linterna gris")));
		
		coleccionprueba.subirPrecio(444, "2");
		System.out.println(coleccionprueba.conCapa());
		System.out.println(coleccionprueba.getValorColeccion());
		System.out.println(coleccionprueba.getVolumenColeccion());
		System.out.println(coleccionprueba.masValioso());

	}

}

package es.indra.curso;

import es.indra.curso.clases.Carrera;
import es.indra.curso.clases.Corredor;
import es.indra.curso.clases.Pista;

public class Main {

	public static void main(String[] args) {
		
		
		Corredor corredor1 = new Corredor("corredor1", 10, 1000);
		Corredor corredor2 = new Corredor("corredor2", 20, 500);
		Corredor corredor3 = new Corredor("corredor3", 15, 200);
		Corredor corredor4 = new Corredor("corredor4", 20, 250);
		Corredor corredor5 = new Corredor("corredor5", 5, 400);
		Corredor corredor6 = new Corredor("corredor6", 10, 1000);
		Corredor corredor7 = new Corredor("corredor7", 30, 1000);
		Corredor corredor8 = new Corredor("corredor8", 5, 500);
		

		Pista pista = new Pista("pista1", 100);
		pista.getCorredores().add(corredor1);
		pista.getCorredores().add(corredor2);
		pista.getCorredores().add(corredor3);
		pista.getCorredores().add(corredor4);
		pista.getCorredores().add(corredor5);
		pista.getCorredores().add(corredor6);
		pista.getCorredores().add(corredor7);
		pista.getCorredores().add(corredor8);
		
		Carrera carrera = new Carrera("carrera1", "Tierra", pista);
		
		Corredor ganador;
		
		ganador = carrera.ejecutarCarrera();
		
		System.out.print("El mas veloz es: " + ganador.getNombre());
		
	
	}
}

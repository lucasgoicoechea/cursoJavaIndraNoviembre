package es.indra.curso.ejex;

import es.indra.curso.entities.Carrera;
import es.indra.curso.entities.Corredor;
import es.indra.curso.entities.Pista;

public class Main {
	public static void main(String [] args) {
		Carrera carrera1 = new Carrera();
		carrera1.setNombre("primera carrera");
		carrera1.setLugar("almeria");
		
		Pista pista1 = new Pista();
		pista1.setLargo(800);
		pista1.setNombre("pista d 800m");
		
		Corredor juanPeres = new Corredor();
		juanPeres.setNombre("juancito");
		juanPeres.setDistancia(1000);
		juanPeres.setVelocidad(26);
		
		Corredor mateoRunner = new Corredor();
		mateoRunner.setNombre("mateo");
		mateoRunner.setDistancia(600);
		mateoRunner.setVelocidad(43);
		
		
		pista1.getCorredores().add(juanPeres);
		pista1.getCorredores().add(mateoRunner);
		
		carrera1.setPista(pista1);
		
		Corredor ganador= carrera1.ejecutarCarrera();
		System.out.print("El ganador es" +ganador.getNombre());
	}
}

package es.indra.curso.entities;

import java.util.ArrayList;
import java.util.List;

public class Main {


	public static void main(String[] args) {
		
		Carrera laCarrera = new Carrera();
		laCarrera.setNombre("primera carrea");
		laCarrera.setLugar("Madrid");
		
		Pista pista1 = new Pista();
		pista1.setLargo(800);
		pista1.setNombre("de 800");
		/*
        Corredor mateoRunner = new Corredor();
        mateoRunner.setNombre("el runner");
        mateoRunner.setDistancia(1000);
        mateoRunner.setVelocidad(26);
        
        pista1.getCorredores().add(juanPeres);
        pista1.getCorredores().add(mateoRunner);
		*/
		laCarrera.setPista(pista1);
		
		Corredor ganador = laCarrera.ejecutarCarrera();
		System.out.println(ganador);
		
		
	}

	
}

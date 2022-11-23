package es.indra.CursoJava.excepciones;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LanzadorExcepciones {

	public List<Integer> leerNumero() throws IOException {
		List<Integer> numeros = new ArrayList<>(2);
		try (Scanner leer = new Scanner(System.in)) {
			System.out.print("Inserte el primer numero: ");
			numeros.add(leer.nextInt());
			System.out.print("Inserte el segundo numero: ");
			numeros.add(leer.nextInt());
		}
		return numeros;
		
	}
	
	public int generarCalculo(int val1, int val2) {
		return val1/val2;
	}
}

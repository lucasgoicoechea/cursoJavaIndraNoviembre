package es.indra.CursoJava.excepciones;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.lang.ArithmeticException;

public class Main {
	static LanzadorExcepciones lanex = new LanzadorExcepciones();
	protected static List<Integer> valores = new ArrayList<>(2);
	static int valor;
	public static void main(String[] args) {
	
		try {
			valores = lanex.leerNumero();
		} catch (IOException e) {
			System.out.println("Error: el úmero insertado no es correcto");
		}
		try {
			valor = lanex.generarCalculo(valores.get(0), valores.get(1));
			System.out.println("El resultado de la division es: " + valor);
		} catch (ArithmeticException e) {
			System.out.println("Error: se está dividiendo por 0");
		}
		
		
	}

}

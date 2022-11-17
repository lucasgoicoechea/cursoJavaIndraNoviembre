package es.indra.cursoJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class EjemplosExcepciones {

	static Scanner lectorTeclado;
	
	public static void main(String[] args) {

		try {
			ejemploIOexception();
		} catch (FileNotFoundException | NoSuchElementException e1) {
			e1.printStackTrace();
		}
		
		try {
			ejemploNullPointerException();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
				ejemploNumberException();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	private static void ejemploNumberException() {
		int valorDivisor = 0;
		int valorDividendo = 100;
		System.out.println(valorDividendo/valorDivisor);
		
	}

	private static void ejemploIOexception() throws FileNotFoundException, NoSuchElementException {
			lectorTeclado = new Scanner(new File("c:/archivoQueNoexiste.txt"));
			String lineaIngreso = lectorTeclado.nextLine();	
			System.out.println(lineaIngreso);	
	}

	private static void ejemploNullPointerException() {
		String cadenaEjemplo = null;
		System.out.println(cadenaEjemplo.length());
		
	}

}

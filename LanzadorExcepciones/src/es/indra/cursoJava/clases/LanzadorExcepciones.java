package es.indra.cursoJava.clases;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LanzadorExcepciones {

	private int numero1;
	private int numero2;
	private int calculo = 0;
	
	public void leerNumero() {
		try {
			Scanner leer = new Scanner(System.in);
			if(leer == null) {
				throw new FileNotFoundException();
			}else {
				System.out.println("Introduzca el primero numero: ");
				this.numero1 = leer.nextInt();
				
				System.out.println("Introduzca el segundo numero: ");
				this.numero2 = leer.nextInt();
			}
			
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("---FileNotFoundException---");
			e.printStackTrace();
		}catch (NoSuchElementException er) {
			System.out.println("---NoSuchElementException---");
			er.printStackTrace();
		}
	}
	
	public int generarCalculo() {
		try {
			calculo = numero1 + numero2;
		}catch (NumberFormatException e) {
			System.out.println("---NumberFormatException");
			e.printStackTrace();
		}
		
		return calculo;
	}

	public int getNumero1() {
		return numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public int getCalculo() {
		return calculo;
	}
	
	
}

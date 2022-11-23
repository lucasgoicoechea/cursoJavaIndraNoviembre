package es.indra.entregables.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LanzadorExcepciones extends Throwable{
	
static Scanner scan;

	private static void ejemploNumberException() {
		int divisor = 0;
		int dividendo = 100;
		System.out.println(dividendo/divisor);
		
	}

	private static void ejemploIOexception() throws FileNotFoundException, NoSuchElementException {
			scan = new Scanner(new File("c:/notas.txt"));
			String x = scan.nextLine();	
			System.out.println(x);	
	}

	private static void ejemploNullPointerException() {
		String x = null;
		System.out.println(x.length());
		
	}
}

package es.indra.entregables.model;

public class Main {
	public static void main(String[] args) throws LanzadorExcepciones {
		
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
}
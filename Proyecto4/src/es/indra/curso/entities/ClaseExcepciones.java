package es.indra.curso.entities;

public class ClaseExcepciones extends Exception{
	
	@Override
	public void printStackTrace() {
		System.out.println("Error stacktrace");
		super.printStackTrace();
	}

	public void imprime() {
		System.out.println("Error");
	}
}

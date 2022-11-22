package es.indra.cursoJava.clases;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LanzadorExcepciones le = new LanzadorExcepciones();
		
		le.leerNumero();
		le.generarCalculo();
		
		System.out.println("El numero generado es: " + le.getCalculo());

	}

}

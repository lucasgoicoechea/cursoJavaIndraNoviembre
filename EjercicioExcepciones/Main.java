import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String args[]) throws FileNotFoundException {
		
		LanzadorExcepciones lanzador=new LanzadorExcepciones();
		lanzador.leerNumero();
		lanzador.generarCalculo();
	}
	
}

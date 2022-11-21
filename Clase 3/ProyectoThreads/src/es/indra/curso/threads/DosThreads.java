package es.indra.curso.threads;

public class DosThreads {

	public static void main(String[] args) {
		
		Contenedor contenedor= new Contenedor();
		SimpleThread miPrimerT= (SimpleThread) new SimpleThread("Gimnasia",45200);
		miPrimerT.setContenedor(contenedor);
		miPrimerT.start();
		new SimpleThread("Estudiantes").start();
	}
}

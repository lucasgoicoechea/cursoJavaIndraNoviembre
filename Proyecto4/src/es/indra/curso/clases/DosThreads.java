package es.indra.curso.clases;

public class DosThreads {

	public static void main(String[] args) {
		
		Contenedor contendor = new Contenedor();
        SimpleThread miPrimerT = new SimpleThread(9300, "Equipo1");
        miPrimerT.setContenedor(contendor);
        miPrimerT.start();
		
		new SimpleThread("Hilo2").start();
	}
}

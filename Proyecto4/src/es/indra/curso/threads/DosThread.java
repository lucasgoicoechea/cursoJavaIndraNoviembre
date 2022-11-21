
package es.indra.curso.threads;
public class DosThread {
    
    public static void main(String[] args) {
    	Contenedor contendor = new Contenedor();
        SimpleThread miPrimerT = (SimpleThread) new SimpleThread("Celta de Vigo");
        miPrimerT.setContenedor(contendor);
        miPrimerT.start();
        
        new SimpleThread("Almeria UD").start();
    }
}

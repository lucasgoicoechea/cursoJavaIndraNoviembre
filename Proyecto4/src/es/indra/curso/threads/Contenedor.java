package es.indra.curso.threads;
public class Contenedor {
    
    private int contenido;
    private boolean disponible = true;
    
    public synchronized int get() {
        return contenido;
    }
    
    public synchronized void put(int value) {
        if (disponible) {
            this.disponible = false;
            this.contenido = value;            
        }
        this.disponible = true;
    }
}
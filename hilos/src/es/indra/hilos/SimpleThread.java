package es.indra.hilos;

public class SimpleThread extends Thread{
	
	int cantidadHinchas = 0;
    String nombreEquipo = "Real Madrid";
    Contenedor contendor = null;
    
    // CONSTRUIR 2 NUEVOS CONSTRUCTORES QUE RECIBAN
    // (nombreEquipo, cantidadHinchas)
    public SimpleThread(String nombreEString, int cantidadHinchas) {
        this.cantidadHinchas = cantidadHinchas;
        this.nombreEquipo = nombreEString;
    }
	
    // Constructor propio
    int clasificacion = 3;
    int presupuesto = 700;
    String estrella = "Bezema";
    
    public SimpleThread(int clasificacion, int presupuesto, String estrella) {
        this.clasificacion = clasificacion;
        this.presupuesto = presupuesto;
        this.estrella = estrella;
    }
	//Constructor
	 public SimpleThread(String str) {
	        super(str);
	    }
	    
	    public void run() {
	        for (int i = 0; i < 10; i++) {
	            System.out.println(i + "" + getName());
	            try {
	                sleep((int) (Math.random() * 1000)) ;
	            }
	            catch (InterruptedException  e) {
	                e.printStackTrace();
	            }
	        }
	        System.out.println(getName()  + " termino");
	    }

		public Contenedor getContendor() {
			return contendor;
		}

		public void setContendor(Contenedor contendor) {
			this.contendor = contendor;
		}
	   
	    
}

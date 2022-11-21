package es.indra.curso.threads;
public class SimpleThread extends Thread {
    
	int cantidadHinchas = 0;
    String nombreEquipo = "Real Madrid";
    Contenedor contenedor = null;
    // CONSTRUIR 2 NUEVOS CONSTRUCTORES QUE RECIBAN
    // (nombreEquipo, cantidadHinchas)
    public SimpleThread(String nombreEString, int cantidadHinchas) {
        this.cantidadHinchas = cantidadHinchas;
        this.nombreEquipo = nombreEString;
    }
    
    public SimpleThread(int cantidadHinchas) {
        this.cantidadHinchas = cantidadHinchas;
    }

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

	public int getCantidadHinchas() {
		return cantidadHinchas;
	}

	public void setCantidadHinchas(int cantidadHinchas) {
		this.cantidadHinchas = cantidadHinchas;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public Contenedor getContenedor() {
		return contenedor;
	}

	public void setContenedor(Contenedor contenedor) {
		this.contenedor = contenedor;
	}
    
    
}
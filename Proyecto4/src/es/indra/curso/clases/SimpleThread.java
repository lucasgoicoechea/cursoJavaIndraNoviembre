package es.indra.curso.clases;

public class SimpleThread extends Thread {
	
	private int cantidadHinchas = 0;
	private String nombreEquipo =  "No me gusta el futbol";
	private Contenedor contenedor;
	

	
	
	public SimpleThread(int cantidadHinchas) {
		super();
		this.cantidadHinchas = cantidadHinchas;
	}

	public SimpleThread(int cantidadHinchas, String nombreEquipo) {
		super();
		this.cantidadHinchas = cantidadHinchas;
		this.nombreEquipo = nombreEquipo;
	}

	public SimpleThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
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

	


	public void run() {
		for(int i =0; i<10; i++){
			//System.out.println(i + " " + getName());
			System.out.println(i + " " + nombreEquipo + " " + cantidadHinchas);
			try {
				sleep((int)(Math.random() * 1000));
			}catch(InterruptedException e) {
				
			}
		}
		//System.out.println(getName() +  "terminó");
		System.out.println(nombreEquipo + " " + cantidadHinchas +  "terminó");
	}

}

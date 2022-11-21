package es.indra.curso.threads;

public class SimpleThread extends Thread{
	
	int cantidadHinchas=0;
	String nombreEquipo= "Real Madrid";
	Contenedor contenedor = null;
	
	//CONSTRUIR 2 nuevos constructores que reciban nombreEquipo y cantidadHinchas
	public SimpleThread(String nombreEString, int cantidadHinchas) {
		 this.cantidadHinchas = cantidadHinchas;
	     this.nombreEquipo = nombreEString;	
	}
	//constructor
	public SimpleThread(int cantidadHinchas) {
		this.cantidadHinchas=cantidadHinchas;
	}
	public SimpleThread(String str) {
		super(str);
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" " +getName()+" num de hinchas: "+cantidadHinchas);
			if(contenedor !=null) {
				System.out.print(this.contenedor.get());
				this.contenedor.put(this.getContenedor().get()+ cantidadHinchas);
			}
			try {
				sleep((int) (Math.random()*1000));
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println(getName()+ " terminó");
	}
	public Contenedor getContenedor() {
		return contenedor;
	}
	public void setContenedor(Contenedor contenedor) {
		this.contenedor = contenedor;
	}
	
}

package es.indra.cursojava.modelo;

public class Main {

	public static void main(String[] args) {
		Padre padre1 = new NietoDeIzquierdo(); 
		padre1.setNombre("nombre de padre1");
		
		HijoIzquierdo hijoIzq = new HijoIzquierdo();
	    hijoIzq.setNombre("hijoizq1" );
	    
		NietoDeIzquierdo nietoDeIzq = new NietoDeIzquierdo();
		
		System.out.println(padre1);
		System.out.println(hijoIzq);
		System.out.println(nietoDeIzq);

	}

}

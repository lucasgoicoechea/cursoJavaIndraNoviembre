package es.indra.cursoJava;

import es.indra.cursoJava.entidades.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paleta p1 = new Paleta(15,100, "Iberica");
		Jamon j1 = new Jamon(18, 150, "Iberico");
		Solomillo s1 = new Solomillo(20, "GRUESO", 3);
		double cuentafinal = 0;
		
		s1.calcularGramosSegunGrosor();
		cuentafinal = p1.calcularPrecio() + j1.calcularPrecio() + s1.calcularPrecio();
		p1.imprimirPaleta();
		j1.imprimirJamon();
		s1.imprimirSolomillo();
		System.out.println("Su cuenta final es: " + cuentafinal + " euros");

	}

}

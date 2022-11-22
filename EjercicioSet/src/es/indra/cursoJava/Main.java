package es.indra.cursoJava;

import java.util.HashSet;
import java.util.Set;

import es.indra.cursoJava.clases.ElementoSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ElementoSet e1 = new ElementoSet(2.5, "e1");
		e1.setOrden(1);
		
		ElementoSet e2 = new ElementoSet(3.0, "e2");
		e2.setOrden(2);
		
		ElementoSet e3 = new ElementoSet(1.5, "e3");
		e3.setOrden(3);
		
		Set<ElementoSet> conjunto = new HashSet<ElementoSet>();
		conjunto.add(e1);
		conjunto.add(e2);
		conjunto.add(e3);
		
		for(ElementoSet e: conjunto) {
			System.out.println(e.toString());
		}
	}

}

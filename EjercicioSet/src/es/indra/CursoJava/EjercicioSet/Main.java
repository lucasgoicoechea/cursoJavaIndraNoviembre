package es.indra.CursoJava.EjercicioSet;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		ElementoDeSet elem1 = new ElementoDeSet();
		ElementoDeSet elem2 = new ElementoDeSet();
		ElementoDeSet elem3 = new ElementoDeSet();
		
		elem1.setOrden(123);
		elem2.setOrden(124);
		elem3.setOrden(125);
		elem1.setPrecio(6);
		elem2.setPrecio(4);
		elem3.setPrecio(5);
		elem1.setSerial("Entradas");
		elem2.setSerial("Palomitas");
		elem3.setSerial("Bebida");
		String l1 = elem1.toString(elem1.getPrecio(), elem1.getSerial());
		String l2 = elem2.toString(elem2.getPrecio(), elem2.getSerial());
		String l3 = elem3.toString(elem3.getPrecio(), elem3.getSerial());
		hset.add(l1);
		hset.add(l2);
		hset.add(l3);
		
		hset.forEach(System.out::println);
		
	}

}

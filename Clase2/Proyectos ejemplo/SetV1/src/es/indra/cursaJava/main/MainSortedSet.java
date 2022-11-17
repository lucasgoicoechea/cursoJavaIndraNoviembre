package es.indra.cursaJava.main;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainSortedSet {
	
	public static void main(String[] args) {
		ElementoDeConjunto elementDeSet1 = new ElementoDeConjunto();
		elementDeSet1.setSerial("2452523553");

		ElementoDeConjunto elementDeSet2 = new ElementoDeConjunto();
		elementDeSet2.setSerial("2453535353");
		elementDeSet2.setValor(120);

		SortedSet<ElementoDeConjunto> miConjuntoOrdenado = (SortedSet<ElementoDeConjunto>) new TreeSet<ElementoDeConjunto>();
		miConjuntoOrdenado.add(elementDeSet2);
		miConjuntoOrdenado.add(elementDeSet1);
		for (ElementoDeConjunto elementoDeConjunto : miConjuntoOrdenado) {
			System.out.println(elementoDeConjunto.toString());
		}

		// java 6
		for (Iterator iterator = miConjuntoOrdenado.iterator(); iterator.hasNext();) {
			ElementoDeConjunto elementoDeConjunto = (ElementoDeConjunto) iterator.next();
			System.out.println(elementoDeConjunto);
		}
		// java 8
		for (ElementoDeConjunto elementoDeConjunto : miConjuntoOrdenado) {
			System.out.println(elementoDeConjunto);
		}
		// java 8+
		miConjuntoOrdenado.stream().forEach(elementoDeConjunto -> {
			System.out.println(elementoDeConjunto);
		});
		// java 9+
		miConjuntoOrdenado.forEach(elementoDeConjunto -> {
			System.out.println(elementoDeConjunto);
		});
		// java10+
		miConjuntoOrdenado.parallelStream().forEach(elementoDeConjunto -> {
			System.out.println(elementoDeConjunto);
		});
	}

}

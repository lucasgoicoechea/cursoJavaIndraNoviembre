package es.indra.cursaJava.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;

public class MainSet {

	public static void main(String[] args) {

		ElementoDeConjunto elementDeSet1 = new ElementoDeConjunto();
		elementDeSet1.setSerial("2452523553");

		ElementoDeConjunto elementDeSet2 = new ElementoDeConjunto();
		elementDeSet2.setSerial("2453535353");
		elementDeSet2.setValor(120);

		Set<ElementoDeConjunto> miConjunto = new LinkedHashSet<>();
		miConjunto.add(elementDeSet1);
		miConjunto.add(elementDeSet2);
		miConjunto.add(elementDeSet1);

		for (ElementoDeConjunto elementoDeConjunto : miConjunto) {
			System.out.println(elementoDeConjunto.toString());
		}


	}

}

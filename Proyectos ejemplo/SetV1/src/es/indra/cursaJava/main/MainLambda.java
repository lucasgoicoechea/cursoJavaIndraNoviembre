package es.indra.cursaJava.main;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MainLambda {
	
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
		
		//funciones lambda
		miConjunto.stream().forEach((t -> {
			System.out.println(t.toString());
		}));

	}

}

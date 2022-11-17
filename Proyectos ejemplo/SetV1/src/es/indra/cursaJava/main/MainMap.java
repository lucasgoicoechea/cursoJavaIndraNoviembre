package es.indra.cursaJava.main;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MainMap {
	
	public static void main(String[] args) {
		
		
		ElementoDeConjunto elementDeSet1 = new ElementoDeConjunto();
		elementDeSet1.setSerial("2452523553");

		ElementoDeConjunto elementDeSet2 = new ElementoDeConjunto();
		elementDeSet2.setSerial("2453535353");
		elementDeSet2.setValor(120);

		
		//diccionario Map
		Map<String, ElementoDeConjunto> mapaClaveValor = new HashMap<>();
		mapaClaveValor.put("elemento1", elementDeSet1);
		mapaClaveValor.put("otroelemento", elementDeSet2);
		mapaClaveValor.put("maselemento", elementDeSet1);
		
		mapaClaveValor.forEach((k, valor) -> {
			System.out.println("para la clave: "+ k);
			System.out.println("poseo el valor: " + valor);
			System.out.println("--------------------");
		}
		);
		
	    //diccionario SortedMap
		//SortedMap<String, ElementoDeConjunto> mapaclaveValorOrdneado = new 
		
		ConcurrentMap<String, ElementoDeConjunto> mapaSincronicoConcurrente = new ConcurrentHashMap<>();
		//mapaSincronicoConcurrente.compute(String key, (k, v) -> { (v == null) ? null : v.toString()});
		Runnable t = new Thread(
			public void run() {
				mapaSincronicoConcurrente.clear();
			};
		);
		
	}

}

package es.indra.cursoJava;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//CREO UNA NUEVA LISTA
		List<ElementoDeUnaCollection> miListaDeElementos = new ArrayList<>();
		
		//CREAR UN ELEMENTO A AGREGAR EN LA LISTA
		ElementoDeUnaCollection nuevoelemento1 = new ElementoDeUnaCollection();
		nuevoelemento1.setNombre("elemento 1 ");
		nuevoelemento1.setNumero(10);
		
		//creo otro elemento
		ElementoDeUnaCollection nuevoelemntos2do = new ElementoDeUnaCollection();
		nuevoelemntos2do.setNombre("elemento 2do");
		
		//agregamso elementso la lista
		miListaDeElementos.add(nuevoelemento1);
		miListaDeElementos.add(1, nuevoelemntos2do);
		
		//for o foreach o while 
		for (ElementoDeUnaCollection elementoDeUnaCollection : miListaDeElementos) {
			if (elementoDeUnaCollection.getNumero() > 0)
				System.out.println(elementoDeUnaCollection.getNombre());
		}
		
	}
}

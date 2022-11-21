package es.indra.curso.elementos;

import java.util.ArrayList;
import java.util.List;

public class Main {
		
	public static void main(String[] args) throws ClaseExcepcion {
		
		List<Elemento> elementos = new ArrayList<>();
		Elemento objElemento = new Elemento();
		//elementos.add(objElemento);
		try{
			if(elementos.isEmpty())
				throw new ClaseExcepcion();
			else
				System.out.println(elementos.size());
		}catch (ClaseExcepcion e) {
			// TODO: handle exception
			e.imprime();
		}
	}
}

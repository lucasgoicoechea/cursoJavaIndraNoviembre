package es.indra.curso.entities;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws ClaseExcepciones{
		
		List<Elemento> listaElementos = new ArrayList<>();
		Elemento objeto = new Elemento();
		Componente parte  = new Componente();

		listaElementos.add(objeto);
		listaElementos.add(parte);

		
	}
}

package es.indra.curso.carrera;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	
	public static void main(String args[]) {
		List<Corredor> listaCorredores = new ArrayList<Corredor>();

		for (int i = 0; i < 8; i++) {
			Corredor objCorredor = new Corredor("corredor" + i, 10 + i, 400 + i);
			listaCorredores.add(objCorredor);
		}

		Pista objPista = new Pista("Balaidos", 100, listaCorredores);
		Carrera objCarrera = new Carrera("carrera 1", "Vigo", objPista);
		
		int masVeloz=0;
		Corredor corredorMasVeloz = null;
		for (Iterator iterator = listaCorredores.iterator(); iterator.hasNext();) {
			Corredor corredor = (Corredor) iterator.next();
			int velocidad=objPista.velocidadEnPistaCorredor(corredor);
			if(velocidad>=masVeloz) {
				masVeloz=velocidad;
				corredorMasVeloz=corredor;
			}
				
		}
		System.out.println("El corredor más rapido es: "+corredorMasVeloz.nombre+"y corre:" +masVeloz);
	}
}

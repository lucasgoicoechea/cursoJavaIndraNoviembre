package main;

import java.util.ArrayList;
import java.util.OptionalInt;

import productos.Cereales;
import productos.Detergente;
import productos.Vino;

public class main {
	
	private static ArrayList<producto> productos = new ArrayList<producto>();
	
	public static void main(String[] args) {
		programaPrueba();
		pruebaStream();
		
	
	}
	
	private static boolean programaPrueba() {
		productos.add(new Cereales("Kellogs",12,"Azucarado"));
		productos.add(new Detergente("Ariel",27));
		productos.add(new Vino("Marqués de Valladares","Afrutado",12,23));
		int calorias = 0;
		
		for(producto p:productos) {
			calorias = calorias + p.getCalorias();
		}
		System.out.println("Las calorias totales de la cesta son " + calorias);
		return false;
	}
	private static void pruebaStream() {
		OptionalInt toRet = productos.stream().mapToInt(null).max();
		System.out.println(toRet);
	}
}



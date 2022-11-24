package es.indra.curso.Prueba;

import java.util.ArrayList;

import es.indra.curso.Productos.Alimento;
import es.indra.curso.Productos.Cereales;
import es.indra.curso.Productos.Detergente;
import es.indra.curso.Productos.Vino;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detergente detergente1=new Detergente("Hacendado",5);
		Detergente detergente2=new Detergente("DonLimpio",8);
		Detergente detergente3=new Detergente("Alipende",6);

		Cereales cereales1=new Cereales("Hacendado",3,"maiz");
		Cereales cereales2=new Cereales("Alipende",2.5,"espelta");

		Vino vino1=new Vino("Hacendado","Blanco",15,5);
		Vino vino2=new Vino("Hacendado","Tinto",13,4);

		//Se hace una lista con los alimentos, vino y cereales
		ArrayList<Alimento> lista=new ArrayList<Alimento>();
		lista.add(cereales1);
		lista.add(cereales2);
		lista.add(vino1);
		lista.add(vino2);
		
		ArrayList<Alimento> lista2= new ArrayList<Alimento>();
		Cereales cereales3=new Cereales("Alcampo",6,"maiz");
		Vino vino3= new Vino("Alcampo", "Blanco",17,4.5);
		Vino vino4= new Vino("Rivera","Rosado",16.4,11);
		lista2.add(vino3);
		lista2.add(vino4);
		lista2.add(vino1);
		lista2.add(cereales3);
		lista2.add(cereales2);
		
		//Se hace un bucle recorriendo la lista y sumando las calorias de cada producto
		double calorias=0;
		for(int i=0;i<lista.size();i++) {
			calorias=calorias + lista.get(i).calcularCalorias();
		}

		System.out.println("Calorias totales lista 1 : " + calorias);

		double resultado=0;
		for(int j=0;j<lista2.size();j++) {
			resultado+=lista2.get(j).calcularCalorias();
		}
		
		System.out.println("Calorias totales lista 2 : " + resultado);


	}

}

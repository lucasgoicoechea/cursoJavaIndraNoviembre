package Principal;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Corredor> corredores = new ArrayList<>();
		corredores.add(new Corredor("Juan",20,5500));
		corredores.add(new Corredor("Pedro",19,10000));
		corredores.add(new Corredor("Lucas",20,3000));
		corredores.add(new Corredor("Manu",23,4500));
		corredores.add(new Corredor("Elena",15,30000));
		corredores.add(new Corredor("Paula",21,5000));
		corredores.add(new Corredor("Anastasia",23,6000));
		corredores.add(new Corredor("Patricia",20,9000));
		
		
		Pista pista1 = new Pista("Pista de Barcelona",4000,corredores);
		Carrera carrera1 = new Carrera("Primera Carrera","Barcelona",pista1);
		
		System.out.println("El corredor mas rapido ha sido " + carrera1.ganadorCarrera());
		
		
	}
}

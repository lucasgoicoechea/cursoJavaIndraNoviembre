package springmvc;

import java.util.ArrayList;
import lombok.Data;

@Data
public class Houston {

	private int id;
	private String nombre;
	private int capacidad;
	private int num_lanz;
	private ArrayList<Rocket> lanzamientos;

	public void cohe_lanz(ArrayList<Rocket> lanz,int id) {
		for (Rocket rocket : lanz) {
			if(rocket.getId()==id)rocket.Cambiar_estado(Estado.LANZADO);
		}
	}

	public void Add_rocket(Rocket cohete) {
		this.lanzamientos.add(cohete);
	}

	public void Remove_rocket(Rocket cohete) {
		this.lanzamientos.remove(cohete);
	}

	public int N_lanzamientos(int Num_lanz) {
		return Num_lanz;
	}

	public int N_esperando(ArrayList<Rocket> lanzamientos) {
		int numCola = 0;
		for (Rocket rocket : lanzamientos) {
			if(rocket.getEstado_mision()==Estado.ESPERANDO)numCola++;
		}
		return numCola;

	}

}

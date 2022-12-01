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
	
	
}

package Principal;

import java.util.ArrayList;

public class Pista {
	protected String nombre;
	protected int largo;
	protected ArrayList<Corredor> corredores;

	
	
	public Pista(String nombre, int largo, ArrayList<Corredor> corredores) {
		super();
		this.nombre = nombre;
		this.largo = largo;
		this.corredores = corredores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public ArrayList<Corredor> getCorredores() {
		return corredores;
	}

	public void setCorredores(ArrayList<Corredor> corredores) {
		this.corredores = corredores;
	}

}

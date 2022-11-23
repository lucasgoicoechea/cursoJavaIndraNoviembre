package indra.cursoJava.models;

import indra.cursoJava.interfaces.IInmueble;
import lombok.Data;

@Data
public class Inmueble implements IInmueble{
	private Inventario inventario;
	private String direccion;

	public String getDirection() {
		// TODO Auto-generated method stub
		return direccion;
	}

	public Inventario getInventario() {
		// TODO Auto-generated method stub
		return inventario;
	}
}

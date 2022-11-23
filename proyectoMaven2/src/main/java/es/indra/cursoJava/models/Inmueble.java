package es.indra.cursoJava.models;

import es.indra.cursoJava.interfaces.IInmueble;
import lombok.Data;

@Data
public class Inmueble implements IInmueble {

	protected Inventario unInventario;
	protected String direccion;
	
	public String getDireccion() {
		return direccion;
	}

	public Inventario getInventario() {
		return unInventario;
	}

}

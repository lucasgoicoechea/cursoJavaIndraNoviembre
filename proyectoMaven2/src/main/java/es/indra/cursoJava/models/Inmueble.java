package es.indra.cursoJava.models;

import es.indra.cursoJava.interfaces.IInmueble;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Builder
@Slf4j
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

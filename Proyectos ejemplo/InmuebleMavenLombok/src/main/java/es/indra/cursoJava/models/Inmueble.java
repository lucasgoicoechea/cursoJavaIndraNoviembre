/**
 * 
 */
package es.indra.cursoJava.models;

import es.indra.cursoJava.interfaces.IInmueble;
import lombok.Getter;
import lombok.Setter;

/**
 * @author usuario
 *
 */
@Getter
@Setter
public class Inmueble implements IInmueble {

	private String direccion;
	private Inventario inventarion;
	
	public String getDireccion() {
		return this.direccion;
	}

	public Inventario getInventario() {
		return this.inventarion;
	}

	
	

}

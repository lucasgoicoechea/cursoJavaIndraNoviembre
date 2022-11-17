/**
 * 
 */
package es.indra.cursojava.modelo;

/**
 * @author lgoicoechea
 *
 */
public abstract class Padre {
	
	protected String nombre;
	protected int antiguedad = 0;
	
	@Override
	public String toString() {
		return "Soy PADRE " + nombre + " antiguo:" + antiguedad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

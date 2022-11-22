package es.indra.cursoJava.entidades;
import java.util.Date;
public class Jamon  extends CorteCerdo{

	protected String nombreJamon;
	
	public Jamon(String nombreJamon, String raza, Date fechaDeCaducidad, boolean estaRico) {
		super(raza, fechaDeCaducidad, estaRico);
		this.nombreJamon = nombreJamon;
	}
	

	public String getNombreJamon() {
		return nombreJamon;
	}

	public void setNombreJamon(String nombreJamon) {
		this.nombreJamon = nombreJamon;
	}
	
}

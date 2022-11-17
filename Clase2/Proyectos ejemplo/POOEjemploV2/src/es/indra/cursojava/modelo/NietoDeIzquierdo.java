package es.indra.cursojava.modelo;

public class NietoDeIzquierdo extends HijoIzquierdo {
    
	protected boolean izquierdo = true;
	protected boolean derecho = false;
	
	@Override
	public String toString() {
		return "SOY NIETO de IZQUIERDO";
	}
	
	public boolean isDerecho() {
		return derecho;
	}
	
}

package es.indra.curso.entities;

public class Carrera {
	
	protected String nombre;
	protected String lugar;
	protected Pista pista;

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public Pista getPista() {
		return pista;
	}
	public void setPista(Pista pista) {
		this.pista = pista;
	}

	public Corredor ejecutarCarrera() {
		int velocidadCorredor = 0;
		Corredor ganador = null;
		for (Corredor corredorTmp : this.getPista().getCorredores()) {
			int velocidad = corredorTmp.getVelocidad() * (corredorTmp.getDistancia() - this.pista.getLargo());
			if(velocidad > velocidadCorredor) {
				velocidadCorredor = velocidad;
				ganador = corredorTmp;
			}
		}
		return ganador;
	}
}

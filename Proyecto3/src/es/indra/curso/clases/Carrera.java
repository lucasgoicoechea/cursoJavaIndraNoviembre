package es.indra.curso.clases;

public class Carrera {
	
	private String nombre;
	private String lugar;
	private Pista pista;
	
	public Carrera(String nombre, String lugar, Pista pista) {
		super();
		this.nombre = nombre;
		this.lugar = lugar;
		this.pista = pista;
	}
	
	public Corredor ejecutarCarrera() {
		int velocidadCorredor = 0;
		Corredor corredorGanador = null;
		
		for(Corredor corredorTmp: this.pista.getCorredores()) {
			int velocidad = corredorTmp.getVelocidad() * (corredorTmp.getDitancia() - this.pista.getLargo());
			if(velocidad > velocidadCorredor) {
				velocidadCorredor = velocidad;
				corredorGanador = corredorTmp;
			}
		}
		
		return corredorGanador;
	}

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
	
	

}

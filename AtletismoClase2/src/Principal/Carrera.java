package Principal;

public class Carrera {
	protected String nombre;
	protected String lugar;
	protected Pista pista;

	
	
	public Carrera(String nombre, String lugar, Pista pista) {
		this.nombre = nombre;
		this.lugar = lugar;
		this.pista = pista;
	}
	
	public String ganadorCarrera() {
		Corredor corredorMasRapido = new Corredor();
		Corredor corredorActual;
		
		for(int i = 0; i < pista.getCorredores().size(); i++) {
			corredorActual = pista.getCorredores().get(i);
			
			if (corredorMasRapido != null) {
				if(calculoVelocidad(corredorActual) >= calculoVelocidad(corredorMasRapido)) {
					corredorMasRapido = corredorActual;
				}
			}else {
				corredorMasRapido = corredorActual;
			}
			
		}
		return corredorMasRapido.getNombre();
	}
	
	private float calculoVelocidad(Corredor p_corredor) {
		
		return p_corredor.getVelocidad() * (p_corredor.getDistancia() - pista.largo);
		
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

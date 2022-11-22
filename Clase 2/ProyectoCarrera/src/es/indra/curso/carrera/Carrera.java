package es.indra.curso.carrera;

public class Carrera {
	
	protected String nombre;
	protected String lugar;
	protected Pista _pista;
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
	public Pista get_pista() {
		return _pista;
	}
	public void set_pista(Pista _pista) {
		this._pista = _pista;
	}
	public Carrera(String nombre, String lugar, Pista _pista) {
		super();
		this.nombre = nombre;
		this.lugar = lugar;
		this._pista = _pista;
	}
	
	
}

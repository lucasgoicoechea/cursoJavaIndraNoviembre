package es.indra;

import javax.persistence.*;

@Entity
@Table
public class Caza {

	@Id
	int id;

	protected String nombre;

	@OneToOne(cascade = CascadeType.ALL)
	Piloto piloto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}



}

package es.indra;

import javax.persistence.*;


@Entity
@Table(name = "personas")
public class Piloto {

	@Id
	int id;

	String nombre;

	String apellidos;
	

	@OneToOne(cascade = CascadeType.ALL)
	Caza caza;

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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Caza getCaza() {
		return caza;
	}

	public void setCaza(Caza caza) {
		this.caza = caza;
	}


}

package model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "paises")
public class Pais implements Serializable {
	private static final long serialVersionUID = -1L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "nombre")
	private String nombre;
	@OneToMany(mappedBy = "pais", targetEntity = Ciudad.class, cascade = CascadeType.ALL)
	private Set<Ciudad> ciudades;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<Ciudad> getCiudades() {
		return ciudades;
	}
	public void setCiudades(Set<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
	
}

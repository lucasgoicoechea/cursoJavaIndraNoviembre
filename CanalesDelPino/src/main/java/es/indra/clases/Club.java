package es.indra.clases;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	
@Entity
@Table(name="CLUB")
public class Club {
	@Id
	@Column(name="identificador")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String identificador;
	
	private String nombre;
	private String direccion;
	private String ciudad;
	private List<Balon> listaBalones = new ArrayList();
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public List<Balon> getListaBalones() {
		return listaBalones;
	}
	public void setListaBalones(List<Balon> listaBalones) {
		this.listaBalones = listaBalones;
	}
	@Override
	public String toString() {
		return "Club [identificador=" + identificador + ", nombre=" + nombre + ", direccion=" + direccion + ", ciudad="
				+ ciudad + ", listaBalones=" + listaBalones + "]";
	}
	
	public void eliminarBalon(Balon balon) {
		listaBalones.remove(balon);
	}
	
	public void agregarBalon(Balon balon) {
		listaBalones.add(balon);
	}
}

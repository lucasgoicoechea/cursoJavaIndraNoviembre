package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "legajo")
public class Legajo implements Serializable {
	private static final long serialVersionUID = -1L;
	@Id
	@Column(name = "codigo")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String codigo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "anios_antiguedad")
	private Integer anios_antiguedad;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAnios_antiguedad() {
		return anios_antiguedad;
	}

	public void setAnios_antiguedad(Integer anios_antiguedad) {
		this.anios_antiguedad = anios_antiguedad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

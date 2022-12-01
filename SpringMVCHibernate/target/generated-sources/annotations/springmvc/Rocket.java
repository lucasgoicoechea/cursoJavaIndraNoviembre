package springmvc;

import java.util.Date;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ROCKET")
public class Rocket {
	
	private Date Fecha_lanzamiento;
	private String Nombre;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int id_base;
	private Estado Estado_mision;
	
	public void Cambiar_fecha(Date fecha) {
		this.Fecha_lanzamiento = fecha;
	}
	
	public void Cambiar_estado(Estado new_estado) {
		this.Estado_mision = new_estado;
		
	}



}

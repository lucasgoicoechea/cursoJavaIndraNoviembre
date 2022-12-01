package springmvc;

import java.util.Date;
import lombok.Data;

@Data
public class Rocket {
	private Date Fecha_lanzamiento;
	private String Nombre;
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

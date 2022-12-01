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

}

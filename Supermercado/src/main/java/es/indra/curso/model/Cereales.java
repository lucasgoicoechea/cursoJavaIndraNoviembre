package es.indra.curso.model;

import java.time.LocalDate;

import es.indra.curso.interfaces.EsAlimento;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
@ToString
public class Cereales extends Producto implements EsAlimento {

	private String marca;
	private double precio;
	private String tipo;

	public void setCaducidad(LocalDate fc) {
		// TODO Auto-generated method stub

	}

	public LocalDate getCaducidad() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCalorias() {
		if (this.tipo == "espelta")
			return 5;
		else if (this.tipo == "maiz")
			return 8;
		else if (this.tipo == "trigo")
			return 12;
		else
			return 15;

	}

}

package es.indra.curso.model;

import es.indra.curso.interfaces.ConDescuento;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Detergente implements ConDescuento {

	private String marca;
	private double precio;

	public void setDescuento(double des) {
		// TODO Auto-generated method stub
	}

	public double getDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getPrecioDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

}

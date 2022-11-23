package es.indra.curso.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cine {

	protected String direccion;
	protected int fechaInauguracion;
	protected String nombre;
	protected BigDecimal precioEntrada;
	List<Funcion> horariosFunciones = new ArrayList<>();
}

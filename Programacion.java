
import java.util.*;

public class Programacion 
{

	private String fechaFin;
	private String fechaHoraCreada;
	private String fechaInicio;
	
	public Programacion(String fechaFin,String fechaHoraCreada,String fechaInicio) {
		this.fechaFin=fechaFin;
		this.fechaHoraCreada=fechaHoraCreada;
		this.fechaInicio=fechaInicio;
	}
	
	public boolean estaCompleto() {
		return true;
	}
	
	public boolean estaInicioaFuncion() {
		return true;
	}
	
	public boolean estaVigente() {
		return true;
	}
	
}

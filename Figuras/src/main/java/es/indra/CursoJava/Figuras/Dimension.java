package es.indra.CursoJava.Figuras;
import lombok.Data;

@Data
public class Dimension {
	protected double Alto;
	protected double Ancho;
	protected double Profundidad;
	
	public Dimension() {
		this.Alto = 0;
		this.Ancho = 0;
		this.Profundidad = 0;
	}
	
	public Dimension(double Alto, double Ancho, double Profundidad) {
		this.Alto = Alto;
		this.Ancho = Ancho;
		this.Profundidad = Profundidad;
	}
	
	public double getVolumen() {
		return Alto*Ancho*Profundidad;
	}
	
	public String toString() {
		return "El objeto tiene de alto " + Alto + " de ancho " + 
				Ancho + " de profundo " + Profundidad + " y de volumen " + getVolumen();
	}

	public double getAlto() {
		return Alto;
	}

	public void setAlto(double alto) {
		Alto = alto;
	}

	public double getAncho() {
		return Ancho;
	}

	public void setAncho(double ancho) {
		Ancho = ancho;
	}

	public double getProfundidad() {
		return Profundidad;
	}

	public void setProfundidad(double profundidad) {
		Profundidad = profundidad;
	}
	
	
}

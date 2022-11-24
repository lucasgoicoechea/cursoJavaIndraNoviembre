package productos;

import interfaces.IEsLiquido;
import main.producto;

public class Detergente extends producto implements IEsLiquido {

	private String marca;
	private double precio;
	private double volumen;
	private String tipoEnvase;

	public Detergente(String marca, double precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setTipoEnvase(String tipoEnvase) {
		this.tipoEnvase = tipoEnvase;
	}

	public String getTipoEnvase() {
		return tipoEnvase;
	}

	public String toString() {
		String toRet = "Este producto es de la marca " + marca;
		toRet = toRet + "\nTiene un precio de " + precio + "€";
		toRet = toRet + "\nTiene un volumen de " + volumen + " Litros";
		toRet = toRet + "\nSu tipo de envase es " + tipoEnvase;
		return toRet;
	}

}

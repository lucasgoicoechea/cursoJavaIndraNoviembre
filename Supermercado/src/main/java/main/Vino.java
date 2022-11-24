package main;

public class Vino implements EsLiquido, ConDescuento{
	private String marca;
	private String tipo;
	private double grados;
	private double precio;
	private double descuento;
	private double volumen;
	private String tipoEnvase;
	
	public Vino(String marca, String tipo, double grados, double precio) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.grados = grados;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getGrados() {
		return grados;
	}

	public void setGrados(double grados) {
		this.grados = grados;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Vino [marca=" + marca + ", tipo=" + tipo + ", grados=" + grados + ", precio=" + precio + ", descuento="
				+ descuento + ", volumen=" + volumen + ", tipoEnvase=" + tipoEnvase + "]";
	}

	public void setDescuento(double des) {
		this.descuento = des;
		
	}

	public double getDescuento() {
		return this.descuento;
	}

	public double getPrecioDescuento() {
		return this.getPrecio() - this.getDescuento();
	}

	public void setVolumen(double v) {
		this.volumen = v;
	}

	public double getVolumen() {
		return this.volumen;
	}

	public void setTipoEnvase(String env) {
		this.tipoEnvase = env;		
	}

	public String getTipoEnvase() {
		return this.tipoEnvase;
	}
	
	
}

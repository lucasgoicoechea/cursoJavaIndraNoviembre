package es.indra.cursaJava.main;

public class ElementoDeConjunto {

	int valor;
	String serial;
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	
	@Override
	public String toString() {
		return this.getSerial() + " con valor int:" + this.getValor();
	}
	
	
}

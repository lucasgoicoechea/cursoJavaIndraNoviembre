package es.indra.cursoJava.entidades;

public class Solomillo extends CorteCerdo {

	private String tipoCorte = "";
	private int cantidadFiletes = 0;
	private final double GRAMOS_FINO = 100;
    private final int GRAMOS_GRUESO = 200;


    
    
	public Solomillo(double precio, double gramos, String tipoCorte, int cantidadFiletes) {
		super(precio, gramos);
		this.tipoCorte = tipoCorte;
		this.cantidadFiletes = cantidadFiletes;
	}

	
	public Solomillo(double precio, String tipoCorte, int cantidadFiletes) {
		super(precio);
		this.tipoCorte = tipoCorte;
		this.cantidadFiletes = cantidadFiletes;
	}


	public String getTipoCorte() {
		return tipoCorte;
	}

	public void setTipoCorte(String tipoCorte) {
		this.tipoCorte = tipoCorte;
	}
	
	public void calcularGramosSegunGrosor() {
		if(tipoCorte == "FINO") {
			this.gramos = this.cantidadFiletes * this.GRAMOS_FINO;
		}else if(tipoCorte == "GRUESO") {
			this.gramos = this.cantidadFiletes * this.GRAMOS_GRUESO;
		}else {
			this.gramos = this.cantidadFiletes * this.GRAMOS_FINO;
		}
	}
	public void imprimirSolomillo() {
		System.out.println("Ha comprado " + this.cantidadFiletes + " de solomillo con el precio "
				 + this.precio + " y ha pedido " + this.cantidadFiletes + " filetes");
	}
}

package es.indra.cursoJava.entidades;

public class Paleta extends CorteCerdo{
	protected static int costillas = 5;
	
	public static void main(String[] args) {
		if(costillas > ncajas) {
			System.out.println("Faltan cajas");
		}else{
			int ppal = quitar_carne(500, 250);
			System.out.println("Creando pedido, hay "+ ppal + " gramos de Paleta");
			
		}
		
	}
}

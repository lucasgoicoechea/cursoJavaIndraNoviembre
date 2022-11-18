package es.indra.curso.clases;

public class main {
	// Creado por Leyre Canales, Lidia Hernandez y Jesús Fernández
	
	public static void main(String[] args) {
		elemento e1 = new elemento(1);
		elemento e2 = new elemento(2);
		elemento e3 = new elemento(3);
		Componente comp = new Componente();
		comp.getElementos().add(e1);
		comp.getElementos().add(e2);
		comp.getElementos().add(e3);
		
		try{
			int dim = comp.getElementos().size();
			if(dim > 10) {
				throw new Excepciones();
			}else {
				System.out.println("El tamaño es: " + dim);
			}
		}catch(Excepciones er) {
			System.out.println(er.getMensajeError());
		}
		
	}
	

}

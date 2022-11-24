package es.indra.CursoJava.Figuras;

public class main {

	public static void main(String[] args) {
		Coleccion colec = new Coleccion("Juguetes");
		Superheroe sup1 = new Superheroe("Batman");
		Superheroe sup2 = new Superheroe("Superman");
		Dimension dim1 = new Dimension(4,5,8);
		Dimension dim2 = new Dimension(5,6,9);
		Figura fig1 = new Figura("1234", 12, sup1, dim1);
		Figura fig2 = new Figura("1235", 13, sup2, dim2);
		colec.aniadirFigura(fig1);
		colec.aniadirFigura(fig2);
		
		System.out.println(colec.masValioso().toString());
		System.out.println(colec.getValorColeccion());

	}

}

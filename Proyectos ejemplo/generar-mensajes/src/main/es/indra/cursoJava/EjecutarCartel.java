package es.indra.cursoJava;

public class EjecutarCartel {
		
		public static void main(String[] args) {
			Cartel miCartel = new Cartel();
			String  mensajeRetorno = miCartel.mostrarCartel("hola");
			System.out.println(mensajeRetorno);
		}
		
}
package indra.cursoJava;


public class HolaMundo {
 
	public static void main(String[] args) {
		//CTRL+SPACE
		// System.out.print("Primer metodo de ejecucion");
		
		//Instancia un texto de tipo String
		String mensaje = "Hola Mundo dos";
		
		//Instancia de la clase HolaMiundo y su funcionalidad
		//HolaMundo miPrimerHolaMundo = new HolaMundo();
		MensajeCustom miMensaje = new MensajeCustom();
		
		
		//Utilizacion de la clase HolaMundo que hemos instanciado en memoria dinamica
		//miPrimerHolaMundo.texto(mensaje);
		miMensaje.textoCustom(mensaje, "Yomismo");
		
	}
	


}

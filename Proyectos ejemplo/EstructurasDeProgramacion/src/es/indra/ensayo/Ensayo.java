package es.indra.ensayo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ensayo {

	public static void main(String[] args) {
		/***************  VARIALBES */////////////////////
		//tipo primitivo
		int valor = 0;
		
		//tipo referencial (el tipo s un objeto)
		Integer valorObjeto = 0; //autoboxing -> Long idCuenta = 23L;
		//Integer valorObjeto2 = new Integer(0);
		String key = "Clave";
		
		/**************  ESTRUCTURAS    ***************************/
		// estrctura IF 
		if (valor > 0) {
			System.out.println("Valor es mayor a 0" + ", y es :" + valor);
		}
		else if ( valor == 0 ) {
			System.out.println("Valor es igual a 0" + ", y es :" + valor);
		}
		else {
			System.out.println("Valor es igual a 0" + ", y es :" + valor);	
		}
		
		//structura SWITCH
		switch (key) {
			case "hola":
				System.out.println("Bienvenido");
				break;
			case "Hola":
				System.out.println("Bienvenido");
				break;
			default:
				System.out.println("no reconozco ingreso");
				break;
			}
		
		switch (valor) {
		case 10:
			System.out.println("es 10");
			break;
		default:
			System.out.println("no es diez");
			break;
		}
		
		//ESTRUCTURAS ITERATIVAS
		//   while 
		valor = 0;
		while (key.equals("Continuar")) {
			System.out.println("continuo");
			valor += 1;
			System.out.println("valor actual:" + valor);
			if (valor > 10)
				key = "Fin While";
		}
		
		//for
		for (int i = 0; i < valor; i++) {
			System.out.println(i);
		}
		
		//for iteracion array
		String[] vectorPalabras =  { "hola", "chau" };
		for (String palabra : vectorPalabras) {
			System.out.println(palabra);
			if (palabra.equals("fin")) {
				break; //				continue;
			}
		}
		
        //MANEJO DE STRINGs
		StringBuffer strBuffer = new StringBuffer("hola");
		StringBuilder strBuilder = new StringBuilder("hola");
		String saludo = "Hola" + "hi" + "bienvenido" + "hello";
	    
		strBuffer.append("hi");
		strBuffer.append("bienvenido");
		strBuffer.subSequence(0, 2);
		strBuffer.chars();
		
		strBuilder.append("hi");
		strBuilder.append("bienvenido");
		strBuilder.subSequence(0, 2);
		strBuilder.chars();
		
		//MANEJO DE FECHAS
		Date fecha = new Date();
		// Timestamp fecha
		Calendar fechad = GregorianCalendar.getInstance(Locale.FRANCE);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-YYYY");
		String fechaStr = sdf.format(fecha);
		
		//Arrays
		//array primitivo 
		int[] miVectorNumerico = {1,230,56,88};
		//array por referenciado
		ArrayList<Integer> miArreglo = new ArrayList<>();
        miArreglo.add(230);
        miArreglo.add(34);
        
        
		
		
	    
		
	}

}

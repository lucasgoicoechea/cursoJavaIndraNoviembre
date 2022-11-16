package es.indra.cursoJava;


public class ManejoExcepciones {

	public static void main(String[] args) {
		try {
			(new ManejoExcepciones()).imprimirNombre("Ju");		
			(new ManejoExcepciones()).imprimirNombre(null);	
		}
		catch (Exception e) {
			//TRES NIVLES DE INFORMACION en LOGS o consola :  INFO-WARNING-ERROR
			System.out.println("[ERROR] SE HA PRODUCIDO UN ERROR, ESE ERROR ES EL SIGUIENTE:");	
			e.printStackTrace();	
		}
		finally {
			System.out.println("FINALIZA MI PROGRAMA");
		}
			
	}
	
	private void imprimirNombre(String nombre) throws Exception {
		/* EXCEPCIONES:
		- EN TIEMPO DE EJECUCION (RUNTIME)
		- FORZADAS O DISEÑADOS,  "DE NEGOCIO"
		- ENTRADA/SALIDA
		*/
	     //errores que suceden en Runtime
		try {
			String miNombreEs = nombre; // ""  o new String()
			if (nombre.length() < 3) {
				throw new ExceptionPropia();
			}
			System.out.println(miNombreEs
				+ ", mi nombre tiene un tamaño de chars:" 
				+ miNombreEs.length());
		}
		catch (Exception e) {
			throw e;
		}
		
	}

}

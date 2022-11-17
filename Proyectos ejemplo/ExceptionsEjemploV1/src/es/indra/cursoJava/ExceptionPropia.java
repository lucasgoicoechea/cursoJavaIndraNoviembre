package es.indra.cursoJava;

public class ExceptionPropia extends InterruptedException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void printStackTrace() {
		System.err.println("HE FORZADO UN ERROR DE NEGOCIO, SIGUIENTE:");
		super.printStackTrace();
	}

}

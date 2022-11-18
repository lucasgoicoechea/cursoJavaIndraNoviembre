package es.indra.curso.clases;

public class Excepciones extends Exception{
	
	private String mensajeError = "Mensaje de error";

	public String getMensajeError() {
		return mensajeError;
	}

	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}
	
}

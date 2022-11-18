
public class ClaseExcepcion extends Exception{
	
	private String mensaje = "Excepcion sin elementos";

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void throwMessage() {
		System.out.println(this.getMensaje());
	}
}



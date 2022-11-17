package entidades;

public class paciente {

	public static String inverso(String mensaje) {
		String mensajeInverso = "";
		for (char carracter : mensaje.toCharArray()) {
			mensajeInverso = carracter + mensajeInverso;
		}
		return mensajeInverso;
	}

}

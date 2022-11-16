package es.indra.cursoJava.builders;

import es.indra.cursoJava.entidades.interfaces.IParticipante;
import es.indra.cursoJava.entidades.miembros.Entrenador;
import es.indra.cursoJava.entidades.staff.Staff;

public class ParticipanteBuilder {
	
	public static IParticipante createPartipanteGenerico(boolean esMiembro) {
		IParticipante particpante = null;
		if (esMiembro) {
			particpante = new Entrenador("Generico entrenador", "Genereico");
		}
		else {
			particpante = new Staff();
		}
		return particpante;
	}

}

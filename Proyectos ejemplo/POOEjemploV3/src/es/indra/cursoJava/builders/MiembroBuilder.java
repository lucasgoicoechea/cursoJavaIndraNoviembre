package es.indra.cursoJava.builders;

import es.indra.cursoJava.entidades.miembros.Jugador;
import es.indra.cursoJava.entidades.miembros.JugadorSuplente;
import es.indra.cursoJava.entidades.miembros.Miembro;

public class MiembroBuilder {

	public Miembro createJugadorGenerico(boolean esSuplente) {
		Miembro jugadorlocal = null;
		if (esSuplente) {
			jugadorlocal = new JugadorSuplente("GENERICO", "TODOS");
		} else {
			jugadorlocal = new Jugador("GENERICO", "TODOS");
		}
		return jugadorlocal;
	}

}

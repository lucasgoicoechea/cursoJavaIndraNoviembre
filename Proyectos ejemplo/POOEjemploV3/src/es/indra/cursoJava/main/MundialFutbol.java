package es.indra.cursoJava.main;

import es.indra.cursoJava.builders.ParticipanteBuilder;
import es.indra.cursoJava.entidades.interfaces.IParticipante;
import es.indra.cursoJava.entidades.miembros.Entrenador;

public class MundialFutbol {
	
	public static void main(String[] args) {
		IParticipante parti = ParticipanteBuilder.createPartipanteGenerico(true);
		Entrenador entrenador = (Entrenador) parti;
		System.out.println(entrenador.soyElCoach());
	}

}

package es.indra.cursoJava.entidades.staff;

import es.indra.cursoJava.entidades.interfaces.IParticipante;

public class Staff implements IParticipante{

	@Override
	public String presentarse() {
		return "hola soy parte del staff";
	}

	@Override
	public String getNombreYRol() {
		// TODO Auto-generated method stub
		return null;
	}

}

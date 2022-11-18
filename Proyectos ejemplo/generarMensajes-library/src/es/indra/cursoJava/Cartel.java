package es.indra.cursoJava;

import javax.swing.JOptionPane;

public class Cartel {
	
	public String mostrarCartel(String mensaje) {
		mensaje = " " + mensaje + " ";
		return JOptionPane.showInputDialog(mensaje, null);
	}

}

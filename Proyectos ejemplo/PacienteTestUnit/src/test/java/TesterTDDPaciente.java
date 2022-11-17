import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import entidades.paciente;

public class TesterTDDPaciente {


    @Test
    public void testeaInverso() {
    	assertEquals("Error en lo que se demanda" , "DCBA" , paciente.inverso("ABCD"));
    	assertNotEquals("esto es lo q no es espera", "DBCA" , "ABCD");
    }
	

}
  
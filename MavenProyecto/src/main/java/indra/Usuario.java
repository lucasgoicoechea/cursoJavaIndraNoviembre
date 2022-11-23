package indra;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class Usuario implements Serializable {
	
	private static final long seriaVersionUID = 2599368614755368860L;
	private long id;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String mail;
	private String telefono;
	private boolean activo;
	
	public String getNombreCompleto() {
		
		return "";
	}
	
	private void hola() {
		Usuario usuario = new Usuario.UsuarioBuilder().id(1234L).build();
	}
}

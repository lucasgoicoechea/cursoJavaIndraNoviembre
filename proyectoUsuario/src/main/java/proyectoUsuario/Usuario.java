package proyectoUsuario;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Builder
public class Usuario implements Serializable {
 private long id;
 private String nombre;
 private String primerApellido;
 private String segundoApellido;
 private String mail;
 private String telefono;
 
 
 
}
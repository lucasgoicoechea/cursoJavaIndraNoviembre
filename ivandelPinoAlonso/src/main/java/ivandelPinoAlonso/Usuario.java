package ivandelPinoAlonso;

import java.io.Serializable;

@Builder
@Slf4j
public class Usuario implements Serializable{
	private static final long serialVersionUID = 2599368614755368860L;
	
	private @Setter long id;
	private @Getter String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String mail;
	private String telefono;
	
	public Usuario(long id, String nombre, String primerApellido, String segundoApellido, String mail,
			String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.mail = mail;
		this.telefono = telefono;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getNombreCompleto() {
		return this.getNombre() + " " + this.getPrimerApellido() + " " + this.getSegundoApellido();
	}
}

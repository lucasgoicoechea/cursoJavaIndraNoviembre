@Data
public class Inmueble implements IInmueble{
	
	private Inventario inventario;
	
	public String getDireccion() {
		return "";
	}
	public Inventario getInventario() {
		return this.inventario;
	}
}

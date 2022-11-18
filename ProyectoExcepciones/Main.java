import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ExcepcionesDeNegocio  {
	Array[] vector = new Array[20];
	List<Elemento> elementos=new ArrayList<>();
	
	Elemento elemento1= new Elemento();
	elementos.add(elemento1);
	
	if(!elementos.isEmpty()) {
		try {
			elementos.get(2);
		}
		catch (Exception e) {
			ExcepcionesDeNegocio.Error();
		}
	}
	}
}

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	//Iván del Pino

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Elemento> listaElementos = new ArrayList();
		listaElementos.add(new Elemento(1));
		listaElementos.add(new Elemento(2));
		listaElementos.add(new Elemento(3));
		Componente componente = new Componente(listaElementos);
		
		try {
			if(componente.getListaElemento().size() > 10) {
				throw new ClaseExcepcion();
			}else {
				System.out.println("Tamaño : " + componente.getListaElemento().size());
			}
		}catch(ClaseExcepcion e) {
			e.throwMessage();
		}
	}

}

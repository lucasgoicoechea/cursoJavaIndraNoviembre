import java.util.ArrayList;
import java.util.List;

public class Componente extends Elemento{

	private List<Elemento> elementos=new ArrayList<>();

	public  List<Elemento> getElementos() {
		return elementos;
	}

	public void setElementos(List<Elemento> elementos) {
		this.elementos = elementos;
	}
}

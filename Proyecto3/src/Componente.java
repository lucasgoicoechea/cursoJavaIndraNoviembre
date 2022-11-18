import java.util.ArrayList;
import java.util.List;

public class Componente extends Elemento{
	
	private List<Elemento> listaElemento;

	public Componente() {
		super();
		listaElemento = new ArrayList();
	}	

	public Componente(List<Elemento> listaElemento) {
		super();
		this.listaElemento = listaElemento;
	}

	public List<Elemento> getListaElemento() {
		return listaElemento;
	}

	public void setListaElemento(List<Elemento> listaElemento) {
		this.listaElemento = listaElemento;
	}
	
	
	
}

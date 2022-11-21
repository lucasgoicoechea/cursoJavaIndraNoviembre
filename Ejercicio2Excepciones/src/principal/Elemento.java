package principal;

import java.util.ArrayList;

public class Elemento implements IElemento{

	public void paint(String p_print) {
		System.out.print(p_print);
	}

	public void rePaint() {
		
	}

	public void delete(ArrayList p_lista, Elemento p_elem) {
		
		if (p_lista.contains(p_elem)) {
			p_lista.remove(p_elem);
		}
	}

	public int size(ArrayList p_lista) {
		return p_lista.size();
	}
	
	public Elemento extraerElemento(ArrayList<Elemento> p_lista, int p_index) {
		return p_lista.get(p_index);
	}
	
}

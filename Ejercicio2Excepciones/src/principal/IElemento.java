package principal;

import java.util.ArrayList;

public interface IElemento {
	void paint(String p_print);
	void rePaint();
	void delete(ArrayList p_lista, Elemento p_elem);
	int size (ArrayList p_lista);
}

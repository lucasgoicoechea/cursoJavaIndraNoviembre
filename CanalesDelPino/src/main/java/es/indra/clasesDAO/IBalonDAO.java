package es.indra.clasesDAO;

import java.util.List;
import es.indra.clases.Balon;

public interface IBalonDAO {
	public void addBalon(Balon p);
	public void updateBalon(Balon p);
	public List<Balon> listBalones();
	public Balon getBalonById(String id);
	public void removeBalon(String id);
}

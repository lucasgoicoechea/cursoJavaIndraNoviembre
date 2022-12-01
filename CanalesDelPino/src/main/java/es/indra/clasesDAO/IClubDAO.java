package es.indra.clasesDAO;

import java.util.List;

import es.indra.clases.Balon;
import es.indra.clases.Club;

public interface IClubDAO {
	public void addClub(Club p);
	public void updateClub(Club p);
	public List<Club> listClubes();
	public Balon getClubById(String id);
	public void removeClub(String id);
}

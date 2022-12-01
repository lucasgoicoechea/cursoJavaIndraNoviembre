package es.indra.clasesDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import es.indra.clases.Balon;
import es.indra.clases.Club;


@Repository
public class ClubDAO implements IClubDAO{

	@Override
	public void addClub(Club p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClub(Club p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Club> listClubes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Balon getClubById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeClub(String id) {
		// TODO Auto-generated method stub
		
	}

}

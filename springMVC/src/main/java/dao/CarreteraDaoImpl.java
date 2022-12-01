package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import model.Carretera;
import model.Señal;

@Repository
public class CarreteraDaoImpl implements CarreteraDao{

	private static final Logger logger = LoggerFactory.getLogger(CarreteraDaoImpl.class);


	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addSeñal(Señal c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(c);
		logger.info("Señal saved successfully, Señal Details="+c);


	}

	@Override
	public void updateSeñal(Señal c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(c);
		logger.info("Señal updated successfully, Señal Details="+c);

	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Señal> listSeñales() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Señal> señalesList = session.createQuery("from Señal").list();
		for(Señal p : señalesList){
			logger.info("Señal List::"+p);
		}
		return (ArrayList<Señal>) señalesList;

	}


	@Override
	public void removeSeñal(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Señal p = (Señal) session.load(Señal.class, id);
		if(null != p){
			session.delete(p);
		}
		logger.info("Señal deleted successfully, Señal details="+p);
	}




	@Override
	public Señal getSeñalById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Señal p = (Señal) session.load(Señal.class, id);
		logger.info("Señal loaded successfully, Señal details="+p);
		return p;
	}

	

	

	

}

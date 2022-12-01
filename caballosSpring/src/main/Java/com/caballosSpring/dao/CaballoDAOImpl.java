package com.caballosSpring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.caballosSpring.model.Caballo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Repository
public class CaballoDAOImpl implements CaballoDAO {

	private static final Logger logger = LoggerFactory.getLogger(CaballoDAOImpl.class);

	private SessionFactory sessionFactory;
	
	@Override
	public void addCaballo(Caballo c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(c);
		logger.info("Caballo saved successfully, Caballo Details="+c);
	}

	@Override
	public void updateCaballo(Caballo c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(c);
		logger.info("Caballo updated successfully, Caballo Details="+c);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Caballo> listCaballos() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Caballo> CaballosList = session.createQuery("from Caballo").list();
		for(Caballo c : CaballosList){
			logger.info("Caballo List::"+ c);
		}
		return CaballosList;
	}

	@Override
	public Caballo getCaballoById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Caballo c = (Caballo) session.load(Caballo.class, new Integer(id));
		logger.info("Caballo loaded successfully, Caballo details=" + c);
		return c;
	}

	@Override
	public void removeCaballo(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Caballo p = (Caballo) session.load(Caballo.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Caballo deleted successfully, Caballo details="+p);
	}
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
}

package com.caballosSpring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.caballosSpring.model.Caballo;
import com.caballosSpring.model.Carrera;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Repository
public class CarreraDAOImpl implements CarreraDAO {

	private static final Logger logger = LoggerFactory.getLogger(CarreraDAOImpl.class);

	private SessionFactory sessionFactory;
	
	@Override
	public void addCarrera(Carrera c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(c);
		logger.info("Carrera saved successfully, Carrera Details="+c);
	}

	@Override
	public void updateCarrera(Carrera c) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(c);
		logger.info("Carrera updated successfully, Carrera Details="+c);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Carrera> listCarreras() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Carrera> CarrerasList = session.createQuery("from Carrera").list();
		for(Carrera c : CarrerasList){
			logger.info("Carrera List::"+ c);
		}
		return CarrerasList;
	}

	@Override
	public Carrera getCarreraById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Carrera c = (Carrera) session.load(Carrera.class, new Integer(id));
		logger.info("Carrera loaded successfully, Carrera details=" + c);
		return c;
	}

	@Override
	public void removeCarrera(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Carrera p = (Carrera) session.load(Carrera.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Carrera deleted successfully, Carrera details="+p);
	}
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
}

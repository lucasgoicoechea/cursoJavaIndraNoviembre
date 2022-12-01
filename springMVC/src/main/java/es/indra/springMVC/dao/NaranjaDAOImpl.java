package es.indra.springMVC.dao;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Repository;

import es.indra.springMVC.model.Naranja;

@Repository

public class NaranjaDAOImpl implements NaranjaDAO {

	private static final Logger logger = LoggerFactory.getLogger(NaranjaDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {

		this.sessionFactory = sf;

	}

	@Override

	public void addNaranja(Naranja p) {

		Session session = this.sessionFactory.getCurrentSession();

		session.persist(p);

		logger.info("Naranja saved successfully, Naranja Details=" + p);

	}

	@Override

	public void updateNaranja(Naranja p) {
		Session session = this.sessionFactory.getCurrentSession();

		session.update(p);

		logger.info("Naranja updated successfully, Naranja Details=" + p);

	}

	@SuppressWarnings("unchecked")

	@Override

	public List<Naranja> listNaranjas() {

		Session session = this.sessionFactory.getCurrentSession();

		List<Naranja> NaranjasList = session.createQuery("from Naranja").list();

		for (Naranja p : NaranjasList) {

			logger.info("Naranja List::" + p);

		}

		return NaranjasList;

	}

	@Override

	public Naranja getNaranjaById(int id) {

		Session session = this.sessionFactory.getCurrentSession();

		Naranja p = (Naranja) session.load(Naranja.class, new Integer(id));

		logger.info("Naranja loaded successfully, Naranja details=" + p);

		return p;

	}

	@Override

	public void removeNaranja(int id) {

		Session session = this.sessionFactory.getCurrentSession();
		Naranja p = (Naranja) session.load(Naranja.class, new Integer(id));

		if (null != p) {
			session.delete(p);
		}

		logger.info("Naranja deleted successfully, Naranja details=" + p);

	}

}

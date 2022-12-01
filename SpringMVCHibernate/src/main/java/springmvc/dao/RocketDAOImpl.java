package springmvc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import springmvc.Rocket;

@Repository
public class RocketDAOImpl implements RocketDAO {

	private static final Logger logger = LoggerFactory.getLogger(RocketDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addRocket(Rocket r) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(r);
		logger.info("Rocket saved successfully, Person Details=" + r);
	}

	@Override
	public void updateRocket(Rocket r) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(r);
		logger.info("Person updated successfully, Person Details=" + r);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Rocket> listRocket() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Rocket> rocketsList = session.createQuery("from Rocket").list();
		for (Rocket r : rocketsList) {
			logger.info("Person List::" + r);
		}
		return rocketsList;
	}

	@Override
	public Rocket getRocketById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Rocket r = (Rocket) session.load(Rocket.class, new Integer(id));
		logger.info("Rocket loaded successfully, Person details=" + r);
		return r;
	}

	@Override
	public void removeRocket(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Rocket r= (Rocket) session.load(Rocket.class, new Integer(id));
		if (null != r) {
			session.delete(r);
		}
		logger.info("Rocket deleted successfully, person details=" + r);
	}

}

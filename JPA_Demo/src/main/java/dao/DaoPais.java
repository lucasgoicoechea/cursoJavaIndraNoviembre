package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import model.Pais;
import utils.JpaUtil;

public class DaoPais {
	public static Pais find(Long id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Pais pais = null;
		try {
			pais = em.find(Pais.class, id);
		} catch (Exception ex) {
			System.out.println("upss!! ha ocurrido un error");
			ex.printStackTrace();
		} finally {
			em.close();
		}
		return pais;
	}

	public static void create(Pais pais) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try {
			em.persist(pais);
			em.getTransaction().commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("Ha ocurrido un error al guardar");
		} finally {
			em.close();
		}
	}

	public static void update(Pais pais) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.merge(pais);
			tx.commit();
			System.out.println("Actualizacion exitosa");
		} catch (Exception ex) {
			tx.rollback();
			System.out.println("Ha ocurrido un erro al actualizar");
			ex.printStackTrace();
		} finally {
			em.close();
		}
	}

	public static void delete(Long id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try {
			Pais p = DaoPais.find(id);
			em.remove(p);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			em.close();
		}
	}
}

package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Ciudad;
import utils.JpaUtil;

public class DaoCiudad {
	public static List<Ciudad> findAllCiudades(int fk) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Query cdades = em.createNativeQuery("Select nombre from ciudades nombre where fk_pais=" + fk);
		List<Ciudad> ciudades = cdades.getResultList();
		return ciudades;
	}

	public static Ciudad find(Long id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Ciudad cdad = null;
		try {
			cdad = em.find(Ciudad.class, id);
		} catch (Exception ex) {
			System.out.println("upss!! ha ocurrido un error");
			ex.printStackTrace();
		} finally {
			em.close();
		}
		return cdad;
	}

	public static void create(Ciudad cdad) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try {
			em.persist(cdad);
			em.getTransaction().commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("Ha ocurrido un error al guardar");
		} finally {
			em.close();
		}
	}

	public static void update(Ciudad cdad) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.merge(cdad);
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
			Ciudad cdad = DaoCiudad.find(id);
			em.remove(cdad);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			em.close();
		}
	}
}

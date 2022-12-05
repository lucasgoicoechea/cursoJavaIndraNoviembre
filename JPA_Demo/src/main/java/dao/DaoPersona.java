package dao;

import javax.persistence.*;
import model.Persona;
import utils.JpaUtil;

public class DaoPersona {
	public static Persona find(Long id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Persona persona = null;
		try {
			persona = em.find(Persona.class, id);
		} catch (Exception ex) {
			System.out.println("upss!! ha ocurrido un error");
			ex.printStackTrace();
		} finally {
			em.close();
		}
		return persona;
	}

	public static void create(Persona persona) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try {
			em.persist(persona);
			em.getTransaction().commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("Ha ocurrido un error al guardar");
		} finally {
			em.close();
		}
	}

	public static void update(Persona persona) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.merge(persona);
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
			Persona p = DaoPersona.find(id);
			em.remove(p);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			em.close();
		}
	}
}

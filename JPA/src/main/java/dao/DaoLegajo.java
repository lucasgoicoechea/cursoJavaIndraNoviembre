package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import model.Ciudad;
import model.Legajo;
import utils.JpaUtil;

public class DaoLegajo {
	public static Legajo find(String id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Legajo legajo = null;
		try {
			legajo = em.find(Legajo.class, id);
		} catch (Exception ex) {
			System.out.println("upss!! ha ocurrido un error");
			ex.printStackTrace();
		} finally {
			em.close();
		}
		return legajo;
	}
	
	public static List<Legajo> findAllLegajos() {
		
		List<Legajo> toRet = new ArrayList<Legajo>();
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Query cdades = em.createNativeQuery("Select nombre,codigo,anios_antiguedad from legajo h");
		toRet = (List<Legajo>)cdades.getResultList();
		return toRet;
	}

	public static void create(Legajo legajo) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try {
			em.persist(legajo);
			em.getTransaction().commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("Ha ocurrido un error al guardar");
		} finally {
			em.close();
		}
	}

	public static void update(Legajo legajo) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.merge(legajo);
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

	public static void delete(String id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try {
			Legajo p = DaoLegajo.find(id);
			em.remove(p);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			em.close();
		}
	}
}
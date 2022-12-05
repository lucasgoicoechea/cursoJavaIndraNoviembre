package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.Empleado;
import utils.JpaUtil;

public class DaoEmpleado {

	public static Empleado find(Long id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Empleado empleado = null;
		try {
			empleado = em.find(Empleado.class, id);
		} catch (Exception ex) {
			System.out.println("upss!! ha ocurrido un error");
			ex.printStackTrace();
		} finally {
			em.close();
		}
		return empleado;
	}

	public static void create(Empleado empleado) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		try {
			em.persist(empleado);
			em.getTransaction().commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("Ha ocurrido un error al guardar");
		} finally {
			em.close();
		}
	}

	public static void update(Empleado empleado) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.merge(empleado);
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
			Empleado p = DaoEmpleado.find(id);
			em.remove(p);
			em.getTransaction().commit();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			em.close();
		}
	}

}

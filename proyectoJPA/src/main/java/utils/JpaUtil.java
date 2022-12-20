package utils;

import javax.persistence.*;
public class JpaUtil {



	private static final EntityManagerFactory emf; 
	static{
		try{
			emf=Persistence.createEntityManagerFactory("JPA_Demo"); 
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex );
			throw new ExceptionInInitializerError(ex);
		}
	}


	public static EntityManagerFactory getEntityManagerFactory(){ 
		return emf;
	}

}

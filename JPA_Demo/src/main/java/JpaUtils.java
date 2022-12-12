import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
	private static final EntityManagerFactory emf;
	
	static {
		try {
			emf=Persistence.createEntityManagerFactory("JPA_Demo");
		}catch (Throwable ex){
			System.err.println("Initial SessionFactory creation failed." + ex );
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static EntityManagerFactory getEmf() {
		return emf;
	}
	
}

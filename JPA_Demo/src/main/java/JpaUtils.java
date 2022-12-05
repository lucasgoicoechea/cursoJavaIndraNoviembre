import javax.persistence.EntityManagerFactory;

public class JpaUtils {
	private static final EntityManagerFactory emf;
	
	static {
		try {
			emf=Persistence.createEntityManagerFactory("JPA_Demo");
		}
	}
}

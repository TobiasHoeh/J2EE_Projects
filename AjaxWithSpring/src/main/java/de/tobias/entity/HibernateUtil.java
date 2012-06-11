import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new AnnotationConfiguration()
					.addPackage("de.bennyn.example.hibernate")
					.addAnnotatedClass(VO_User.class).configure()
					.buildSessionFactory();
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
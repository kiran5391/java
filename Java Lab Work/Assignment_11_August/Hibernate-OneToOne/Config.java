package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Config {
	
	
	public static Session configuration() {
		
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		
		return session;
	}

}

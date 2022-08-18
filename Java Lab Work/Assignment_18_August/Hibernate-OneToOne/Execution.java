package app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Car;
import entity.Person;
import util.Config;

public class Execution {

	public static void main(String[] args) {
		
		try {
		Person p1 = new Person();
		p1.setPname("Kiran");
		p1.setCity("Mumbai");
		
		Person p2 = new Person();
		p2.setPname("Pooja");
		p2.setCity("Mumbai");

		Person p3 = new Person();
		p3.setPname("Neha");
		p3.setCity("Mumbai");
		
		Car c1=new Car();
		c1.setCar_brand("Maruti Suzuki");
		
		Car c2=new Car();
		c2.setCar_brand("Mahindra");
		
		Car c3=new Car();
		c3.setCar_brand("Tata");
		
		p1.setCar(c1);
		p2.setCar(c2);
		p3.setCar(c3);
		c1.setPerson(p1);
		c2.setPerson(p2);
		c3.setPerson(p3);
		
		Session session =Config.configuration();
		Transaction t = session.beginTransaction();
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(c1);
		session.save(c2);
		session.save(c3);

		t.commit();
		session.close();
		}
		catch(Exception e)
		{
			
		}
		
	}

}

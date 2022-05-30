package association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) 
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee e=new Employee();
		e.setEmployeeName("Chandana");
		
		Employee e1=new Employee();
		e1.setEmployeeName("Yash");
		
		Address a=new Address();
		a.setAddressId(10);
		a.setStreet("Girinagar");
		a.setCity("Bengaluru");
		a.setState("Karnataka");
		
		Address a1=new Address();
		a1.setAddressId(11);
		a1.setStreet("RR nagar");
		a1.setCity("Bengaluru");
		a1.setState("Karnataka");
		
		e.setAddress(a);
		e1.setAddress(a1);
		
		em.persist(e);
		em.persist(e1);
		
		System.out.println("Row Inserted");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}

package inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one Employee
		Employee emp = new Employee();
		emp.setName("Chandana");
		emp.setSalary(35000);
		em.persist(emp);
		
		//create one manager
		Manager manager = new Manager();
		manager.setName("Chandu");
		manager.setSalary(50000);
		manager.setDeptName("Programmer");
		em.persist(manager);
		
		em.getTransaction().commit();
		System.out.println("added one epm and one manager");
		em.close();
		factory.close();
	}

}

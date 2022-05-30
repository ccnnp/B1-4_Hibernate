package association1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Test {

	public static void main(String[] args) 
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create a new department
		Department dept=new Department();
		dept.setId(1);
		dept.setName("Information Technology");
		
		Department dept1=new Department();
		dept1.setId(2);
		dept1.setName("Human Resources");
		
		Employee e1=new Employee();
		e1.setName("Chandana");
		e1.setSalary(40000);
		e1.setDept(dept1);
		
		Employee e2=new Employee();
		e2.setName("Chandu");
		e2.setSalary(45000);
		e2.setDept(dept);
		
		em.persist(e1);
		em.persist(e2);
		
		System.out.println("Added employees with department");
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}

}

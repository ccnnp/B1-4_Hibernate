package association2;

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
		dept.setId(15);
		dept.setName("Information Technology");

		Employee e1=new Employee();
		e1.setId(120);
		e1.setName("Dhoni");
		e1.setSalary(80000);

		Employee e2=new Employee();
		e2.setId(121);
		e2.setName("Yash");
		e2.setSalary(60000);

		dept.addEmployee(e1);
		dept.addEmployee(e2);
		
		//save department and its employees using entity manager
		em.persist(dept);
		
		System.out.println("Added department along with two employees to database");
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}

}

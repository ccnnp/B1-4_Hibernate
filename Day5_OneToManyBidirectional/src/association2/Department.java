package association2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Dept_Master")

public class Department 
{
	@Id
	private int Id;
	private String Name;
	@OneToMany(mappedBy="Department",cascade=CascadeType.ALL)
	private Set<Employee> employees = new HashSet<>();
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees=employees;
	}
	public void addEmployee(Employee employee) {
		employee.setDept(this);
		this.getEmployees().add(employee);
	}
}

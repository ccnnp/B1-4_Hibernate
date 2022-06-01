package service;

import entities.Employee;
import repository.IEmployeeRepository;
import repository.IEmployeeRepositoryImpl;

public class IEmployeeServiceImpl implements IEmployeeService
{
	//Establishing connection between Service and Repository
		private IEmployeeRepository dao2;	
		public IEmployeeServiceImpl()
		{
			dao2 = new IEmployeeRepositoryImpl();
		}

	@Override
	public Employee addEmployee(Employee employee) {
		dao2.beginTransaction();
		dao2.addEmployee(employee);
		dao2.commitTransaction();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		dao2.beginTransaction();
		dao2.updateEmployee(employee);
		dao2.commitTransaction();
		return employee;
	}

	@Override
	public Employee searchEmployee(int id) {
		Employee employee = dao2.searchEmployee(id);
		return employee;
	}

	@Override
	public boolean deleteEmployee(int id) {
		dao2.beginTransaction();
		dao2.deleteEmployee(id);
		dao2.commitTransaction();
		return false;
	}

}

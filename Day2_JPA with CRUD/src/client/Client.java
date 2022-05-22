package client;

import entities.Student;
import service.StudentService;
import service.StudentServiceImp;

public class Client {

	public static void main(String[] args) 
	{
		StudentService service = new StudentServiceImp();
		Student student = new Student();
		//CRUD operation
		//create
		student.setID(43);
		student.setName("Chandana");
		service.addStudent(student);
		
		//Retrieve data-find();
		student=service.findStudentById(41);
		System.out.println("ID: "+student.getID());
		System.out.println("ID: "+student.getName());
		
		//update
		student=service.findStudentById(41);
		student.setName("Chandu");
		service.updateStudent(student);
		
		//delete
		student=service.findStudentById(41);
		service.removeStudent(student);
	}
	

}

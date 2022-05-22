package service;

import dao.StudentDao;
import dao.StudentDaoImp;
import entities.Student;

public class StudentServiceImp implements StudentService
{
	private StudentDao dao;
	
	public StudentServiceImp() 
	{
		dao=new StudentDaoImp();
	}

	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}

	@Override
	public Student findStudentById(int ID) {
		Student student = dao.getStudentById(ID);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void removeStudent(Student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}
	
}

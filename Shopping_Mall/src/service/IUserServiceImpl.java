package service;

import entities.User;
import repository.IUserRepository;
import repository.UserRepositoryImpl;

public class IUserServiceImpl implements IUserService
{
	//Establishing connection between Service and Repository
	private IUserRepository dao5;
	
	public IUserServiceImpl()
	{
		dao5 = new UserRepositoryImpl();
	}
	
	//Service calls to perform CRUD operation
	@Override
	public User addNewUser(User user) {
		dao5.beginTransaction();
		dao5.addNewUser(user);
		dao5.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao5.beginTransaction();
		dao5.updateUser(user);
		dao5.commitTransaction();
		return user;
	}

	@Override
	public User login(User user) {
		dao5.beginTransaction();
		((IUserServiceImpl) dao5).login(user);
		dao5.commitTransaction();
		return user;
	}

	@Override
	public boolean logOut() {
		dao5.beginTransaction();
		((IUserServiceImpl) dao5).logOut();
		dao5.commitTransaction();
		return false;
	}

}

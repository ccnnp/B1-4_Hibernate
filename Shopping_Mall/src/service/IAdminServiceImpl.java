package service;

import entities.Shop;
import entities.User;
import repository.IMallAdminRepository;
import repository.IMallAdminRepositoryImpl;

public class IAdminServiceImpl implements IAdminService 
{
	//Establishing connection between Service and Repository
	private IMallAdminRepository dao;
	public IAdminServiceImpl()
	{
		dao = new IMallAdminRepositoryImpl();
	}
	//Service calls to perform CRUD operation
	@Override
	public boolean approveNewShop(Shop shop) {
		dao.beginTransaction();
		((IAdminServiceImpl) dao).approveNewShop(shop);
		dao.commitTransaction();
		return false;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		((IAdminServiceImpl) dao).updateUser(user);
		dao.commitTransaction();
		return user;	
	}

	@Override
	public User login(User user) {
		dao.beginTransaction();
		((IAdminServiceImpl) dao).login(user);
		dao.commitTransaction();	
		return user;
	}

	@Override
	public boolean logOut() {
		dao.beginTransaction();
		((IAdminServiceImpl) dao).logOut();
		dao.commitTransaction();
		return false;
	}

}

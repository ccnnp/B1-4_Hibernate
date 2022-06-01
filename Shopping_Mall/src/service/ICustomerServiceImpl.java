package service;

import java.util.List;

import entities.Item;
import entities.Mall;
import entities.User;
import repository.ICustomerRepository;
import repository.ICustomerRepositoryImpl;

public class ICustomerServiceImpl implements ICustomerService
{
	//Establishing connection between Service and Repository
	private ICustomerRepository dao1;
	public ICustomerServiceImpl()
	{
		dao1 = new ICustomerRepositoryImpl();
	}
	@Override
	public List<Item> searchItem(String itemName) {
		return ((ICustomerServiceImpl) dao1).searchItem(itemName);
	}

	@Override
	public Item orderItem(Item item) {
		return ((ICustomerServiceImpl) dao1).orderItem(item);
	}

	@Override
	public Mall searchMall(int id) {
		return ((ICustomerServiceImpl) dao1).searchMall(id);
	}

	@Override
	public boolean cancelOrder(int orderId) {
		return ((ICustomerServiceImpl) dao1).cancelOrder(orderId);
	}

	@Override
	public User login(User user) {
		dao1.beginTransaction();
		((IUserServiceImpl) dao1).login(user);
		dao1.commitTransaction();
		return user;
	}

	@Override
	public boolean logOut() {
		dao1.beginTransaction();
		((IUserServiceImpl) dao1).logOut();
		dao1.commitTransaction();
		return false;
	}
	
}

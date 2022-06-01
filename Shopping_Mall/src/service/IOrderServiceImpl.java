package service;

import entities.Item;
import entities.Order;
import repository.IItemRepository;
import repository.IOrderRepository;
import repository.IOrderRepositoryImpl;

public class IOrderServiceImpl implements IOrderService 
{
	//Establishing connection between Service and Repository
	private IOrderRepository dao3;	
	public IOrderServiceImpl()
	{
		dao3 = new IOrderRepositoryImpl();
	}

	@Override
	public Order addOrder(Order order) {
		dao3.beginTransaction();
		dao3.addOrder(order);
		dao3.commitTransaction();
		return order;
	}

	@Override
	public Order updateOrder(Order order) {
		dao3.beginTransaction();
		dao3.updateOrder(order);
		dao3.commitTransaction();
		return order;
	}

	@Override
	public Order searchOrderById(int id) {
		Order order = dao3.searchOrderById(id);
		return order;
	}

	@Override
	public boolean cancelMall(int id) {
		dao3.beginTransaction();
		((IOrderServiceImpl) dao3).cancelMall(id);
		dao3.commitTransaction();
		return false;
	}

	@Override
	public Item addItem(Item item) {
		dao3.beginTransaction();
		((IItemRepository) dao3).addItem(item);
		dao3.commitTransaction();
		return item;
	}

}

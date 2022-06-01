package repository;

import entities.Order;

public interface IOrderRepository 
{
	public abstract Order addOrder(Order order);
	public abstract Order updateOrder(Order order);
	public abstract Order searchOrderById(int id);
	public abstract Order deleteOrder(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}

package service;

import entities.Item;
import entities.Order;

public interface IOrderService 
{
	public abstract Order addOrder(Order order);
	public abstract Order updateOrder(Order order);
	public abstract Order searchOrderById(int id);
	public abstract boolean cancelMall(int id);
	public abstract Item addItem(Item item);
}

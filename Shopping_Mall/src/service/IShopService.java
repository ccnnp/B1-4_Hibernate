package service;

import entities.Employee;
import entities.Item;
import entities.Shop;

public interface IShopService 
{
	public abstract Shop addShop(Shop shop);
	public abstract Shop updateShop(Shop shop);
	public abstract Shop searchShopById(int id);
	public abstract Employee addEmployee(Employee employee);
	public abstract Employee updateEmployee(Employee employee);
	public abstract boolean deleteShop(int id);
	public abstract Item addItem(Item item);	
	
}

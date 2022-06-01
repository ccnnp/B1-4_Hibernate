package repository;

import entities.Item;

public interface IItemRepository 
{
	public Item addItem(Item item);
	public Item updateItem(Item item);
	public Item searchItem(int id);
	public void deleteItem(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}

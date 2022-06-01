package repository;

import entities.Mall;

public interface IMalltRepository 
{
	public abstract Mall addMall(Mall mall);
	public abstract Mall updateMall(Mall mall);
	public abstract Mall searchMall(int id);
	public abstract Mall cancelMAll(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	
}

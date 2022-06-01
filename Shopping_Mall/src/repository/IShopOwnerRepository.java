package repository;

import entities.ShopOwner;

public interface IShopOwnerRepository 
{
	public ShopOwner addShopOwner(ShopOwner shopOwner);
	public ShopOwner updateShopOwner(ShopOwner shopOwner);
	public ShopOwner searchShopOwner(int id);
	public ShopOwner deleteShopOwner(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}

package repository;

import javax.persistence.EntityManager;

import entities.ShopOwner;

public class IShopOwnerRepositoryImpl implements IShopOwnerRepository
{
	//Start JPA LifeCycle
		private EntityManager entityManager;
		public IShopOwnerRepositoryImpl() 
		{
			entityManager=JPAUtil.getEntityManager();
		}
	//Create operation - Repo/DAO
	@Override
	public ShopOwner addShopOwner(ShopOwner shopOwner) {
		entityManager.persist(shopOwner);
		return shopOwner;
	}
	//Update operation
	@Override
	public ShopOwner updateShopOwner(ShopOwner shopOwner) {
		entityManager.merge(shopOwner);
		return shopOwner;
	}
	//Retrieve operation
	@Override
	public ShopOwner searchShopOwner(int id) {
		ShopOwner shopOwner = entityManager.find(ShopOwner.class,id);
		return shopOwner;
	}
	//Delete operation
	@Override
	public ShopOwner deleteShopOwner(int id) {
		ShopOwner shopOwner = entityManager.find(ShopOwner.class, id);
		entityManager.remove(shopOwner);
		return shopOwner;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();	
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();	
	}

}

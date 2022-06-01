package repository;

import javax.persistence.EntityManager;

import entities.Mall;

public class IMalltRepositoryImpl implements IMalltRepository
{
	private EntityManager entityManager;
	public IMalltRepositoryImpl()
	{
		entityManager=JPAUtil.getEntityManager();
	}
	@Override
	public Mall addMall(Mall mall) {
		entityManager.persist(mall);
		return mall;
	}

	@Override
	public Mall updateMall(Mall mall) {
		entityManager.merge(mall);
		return mall;
	}

	@Override
	public Mall searchMall(int id) {
		Mall mall= entityManager.find(Mall.class,id);
		return mall;
	}
	@Override
	public Mall cancelMAll(int id) {
		Mall mall= entityManager.find(Mall.class,id);
		entityManager.remove(mall);
		return mall;
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

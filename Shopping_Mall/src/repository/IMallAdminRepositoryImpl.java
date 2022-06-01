package repository;

import javax.persistence.EntityManager;

import entities.MallAdmin;

public class IMallAdminRepositoryImpl implements IMallAdminRepository
{
	//Start JPA LifeCycle
	private EntityManager entityManager;
	public IMallAdminRepositoryImpl() 
	{
		entityManager=JPAUtil.getEntityManager();
	}
	//Create operation - Repo/DAO
	@Override
	public MallAdmin addMallAdmin(MallAdmin mallAdmin) {
		entityManager.persist(mallAdmin);
		return mallAdmin;
	}
	//Update operation
	@Override
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin) {
		entityManager.merge(mallAdmin);
		return mallAdmin;
	}
	//Retrieve operation
	@Override
	public MallAdmin searchMallAdmin(int id) {
		MallAdmin mallAdmin = entityManager.find(MallAdmin.class, id);
		return mallAdmin;
	}
	//Delete operation
	@Override
	public MallAdmin deleteMallAdmin(int id) {
		MallAdmin mallAdmin = entityManager.find(MallAdmin.class, id);
		entityManager.remove(mallAdmin);
		return mallAdmin;
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

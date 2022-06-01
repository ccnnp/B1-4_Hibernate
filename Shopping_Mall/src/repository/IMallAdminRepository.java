package repository;

import entities.MallAdmin;

public interface IMallAdminRepository 
{
	public abstract MallAdmin addMallAdmin(MallAdmin mallAdmin);
	public abstract MallAdmin updateMallAdmin(MallAdmin mallAdmin);
	public abstract MallAdmin searchMallAdmin(int id);
	public abstract MallAdmin deleteMallAdmin(int id);
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}

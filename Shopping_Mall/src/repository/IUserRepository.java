package repository;

import entities.User;

public interface IUserRepository 
{
	public User addNewUser(User user);
	public User updateUser(User user);
	public void deleteUser(long id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}

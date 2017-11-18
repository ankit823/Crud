package Crud.Dao;

import org.springframework.stereotype.Repository;

import Crud.model.User;

@Repository
public interface UserDao {

	int userRepoCreate(User service);
	void userRepoDelete(User service);
	void userRepoUpdate(User service);
	
	
}

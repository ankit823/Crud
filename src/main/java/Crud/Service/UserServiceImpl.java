package Crud.Service;

import org.springframework.stereotype.Service;

import Crud.Dao.UserDao;
import Crud.Dao.UserDaoImpl;
import Crud.model.User;

@Service
public class UserServiceImpl implements UserService{

	public int userCreate(User service) {
		UserDao userDao=new UserDaoImpl();
		return userDao.userRepoCreate(service);
		
	}

	public void userDelete(User service) {
		
	}

	public void userUpdate(User service) {
		
	}



	
}

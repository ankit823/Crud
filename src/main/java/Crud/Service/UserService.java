package Crud.Service;

import org.springframework.stereotype.Service;

import Crud.model.User;

@Service
public interface UserService {

	int userCreate(User service);
	void userDelete(User service);
	void userUpdate(User service);
	
	
}

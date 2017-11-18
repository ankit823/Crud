package Crud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import Crud.Service.UserService;
import Crud.Service.UserServiceImpl;
import Crud.model.User;

@ComponentScan
@Controller
public class CrudController {

	@Autowired
	User userModel;
	UserService user;
	  @RequestMapping(value="/create", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	  @ResponseBody
	  public int create(@RequestBody User jsonString) {
		user= new UserServiceImpl();
	     user.userCreate(jsonString);
	     return userModel.id;
	  }
	  
	  @RequestMapping(value="/update", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	  @ResponseBody
	  public void update(@RequestBody User jsonString) {

		  user= new UserServiceImpl();
		     user.userCreate(jsonString);
	     
	  }
	 	  
	
	  @RequestMapping(value="/delete", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	  @ResponseBody
	  public void delete(@RequestBody User jsonString) {

		  user = new UserServiceImpl();
		     user.userCreate(jsonString);
	     
	  }
	 
  
	
}

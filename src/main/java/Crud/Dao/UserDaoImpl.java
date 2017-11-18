package Crud.Dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.springframework.stereotype.Repository;

import Crud.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	
	public void storeObject(User user){
        
        OutputStream ops = null;
        ObjectOutputStream objOps = null;
        try {
            ops = new FileOutputStream("resource/MyEmpFile.txt");
            objOps = new ObjectOutputStream(ops);
        
            objOps.writeObject(user);
            objOps.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(objOps != null) objOps.close();
            } catch (Exception ex){
                 
            }
        }
         
    }
public void deleteObject(User user){
        
        OutputStream ops = null;
        ObjectOutputStream objOps = null;
        try {
            ops = new FileOutputStream("resource/MyEmpFile.txt");
            objOps = new ObjectOutputStream(ops);
            
            objOps.writeObject(user);
            objOps.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(objOps != null) objOps.close();
            } catch (Exception ex){
                 
            }
        }
         
    }
	
public void updateObject(User user){
    
    OutputStream ops = null;
    ObjectOutputStream objOps = null;
    try {
        ops = new FileOutputStream("resource/MyEmpFile.txt");
        objOps = new ObjectOutputStream(ops);
        
        objOps.writeObject(user);
        objOps.flush();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally{
        try{
            if(objOps != null) objOps.close();
        } catch (Exception ex){
             
        }
    }
     
}

	@Override
	public int userRepoCreate(User service) {
		if(service.isActive()==false)
		storeObject(service);
		return service.id;
	}

	@Override
	public void userRepoDelete(User service) {
		
		updateObject(service);		
	}

	@Override
	public void userRepoUpdate(User service) {
		
		deleteObject(service);
	}

	



	
}

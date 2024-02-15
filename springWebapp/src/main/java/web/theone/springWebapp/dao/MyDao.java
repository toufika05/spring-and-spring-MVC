package web.theone.springWebapp.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import web.theone.springWebapp.model.UserDTO;


@Repository
public class MyDao {
	
	public boolean register(UserDTO dto) {
		// jdbc // hibernate // jpa with hibernate // spring DataJPA
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
	      
	      EntityManager manager = factory.createEntityManager();
	      EntityTransaction transaction = manager.getTransaction();
	      transaction.begin();
	     
	     // manager.contains(dto);
	      
	      UserDTO dto2=new UserDTO();
	      dto2.setName(dto.getName());
	      dto2.setUsername(dto.getUsername());
	      dto2.setPassword(dto.getPassword());
	      
	      
	  
	      manager.persist(dto2);
	      transaction.commit();
	      manager.close();
	      factory.close();
		return true;
	}

}


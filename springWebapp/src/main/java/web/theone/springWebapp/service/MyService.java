package web.theone.springWebapp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.theone.springWebapp.dao.MyDao;
import web.theone.springWebapp.model.UserDTO;

@Service
public class MyService {
	@Autowired
	MyDao dao;
	public boolean register(UserDTO dto){  
		if(dto.getPassword()==12345) {
			return dao.register(dto);
		}else{
			return false;
		}
		
	}
	

}

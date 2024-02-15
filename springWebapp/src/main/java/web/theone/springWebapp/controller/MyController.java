  package web.theone.springWebapp.controller;
 import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import web.theone.springWebapp.model.MyModel;
import web.theone.springWebapp.model.UserDTO;
import web.theone.springWebapp.service.MyService;

//@RequestMapping("/")
//@Component
@Controller
public class MyController {
	
	@Autowired
	MyService service;
	   
	@RequestMapping("/listMymodel")
	   public ModelAndView listmymodel() {
		MyModel model=new MyModel();
		model.setId(100);
		model.setName("Tina");
		
		MyModel model1=new MyModel();
		model1.setId(101);
		model1.setName("Riya");
		
		MyModel model2=new MyModel();
		model2.setId(103);
		model2.setName("Mita");
		
		List list=new ArrayList();
		list.add(model);
		list.add(model1);
		list.add(model2);
		
		   return  new ModelAndView("listModel","list",list);
	   }
	
	@RequestMapping("/link1")
   public String m1() {
	   return "resp1";
   }
	@RequestMapping("/link2")
	   public String m2() {
		   return "resp2";
	   }
	@RequestMapping("/link3")
	   public ModelAndView m3() {
		MyModel mm=new MyModel();
		mm.setId(101);
		mm.setName("Azam");
		   return new ModelAndView("resp3","model",mm);
	   }
	@RequestMapping("/link4")
	   public String m4() {
		   return "resp4";
	   }
	@RequestMapping(value="/login", method=RequestMethod.POST)  
	   public ModelAndView login( @ RequestParam int id,@RequestParam String username,@RequestParam String password) {
		if(username.equals("azam")&& password.equalsIgnoreCase("123")) {
			return new ModelAndView("success","usr",username);
		}
		   return new ModelAndView("resp4","msg","Login failed please try again");
	   }   
	
	@RequestMapping("/link5")
	   public String m5(){
		   return "resp5";
	   }
	
	@RequestMapping(value="/Registration", method=RequestMethod.POST)  
	   public ModelAndView login( @ModelAttribute UserDTO dto) {
		
		 boolean status=service.register(dto);
		 
		System.out.println(dto.getId()+","+dto.getName()+","+dto.getUsername()+","+dto.getPassword());
		if(status) {
			return new ModelAndView("success","usr",dto.getUsername());
		}
		   return new ModelAndView("resp5","msg","Registration failed please try again");
	   }
}

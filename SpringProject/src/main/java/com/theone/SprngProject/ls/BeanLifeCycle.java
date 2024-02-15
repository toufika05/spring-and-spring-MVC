package com.theone.SprngProject.ls;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean,DisposableBean{
  public BeanLifeCycle(){
	  System.out.println("1.Instantiated");
		
	}

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("2. object initialized");
	
}

@Override
public void destroy() throws Exception {
	System.out.println("4. destroyed");
	
}

}

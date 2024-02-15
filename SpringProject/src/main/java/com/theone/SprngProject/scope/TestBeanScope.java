package com.theone.SprngProject.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanScope {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		BeanScope scope = context.getBean(BeanScope.class);
	   BeanScope scope2 = context.getBean(BeanScope.class);
	   System.out.println(scope);
	   System.out.println(scope2);
	
	}

}

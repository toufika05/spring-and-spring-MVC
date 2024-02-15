package com.theone.SprngProject.ls;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanlife {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		BeanLifeCycle bean = context.getBean(BeanLifeCycle.class);
		System.out.println("3. using bean object:"+bean);
		context.close();

	}

}

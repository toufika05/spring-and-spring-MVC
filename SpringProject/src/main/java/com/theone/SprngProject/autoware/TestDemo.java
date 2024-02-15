package com.theone.SprngProject.autoware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Demo1 demo1 = context.getBean(Demo1.class);
		demo1.m1();
		

	}

}

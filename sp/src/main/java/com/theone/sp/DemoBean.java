package com.theone.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.theone.sp.demoo.Demo2;



public class DemoBean {
	
	    public static void main( String[] args ){
	        ApplicationContext context=new  ClassPathXmlApplicationContext("spring.xml");
	        Demo2 demo2 = context.getBean(Demo2.class);
	        demo2.m2();
	       
	    }
}

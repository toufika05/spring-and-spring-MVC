package com.theone.SprngProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ){
        ApplicationContext container=new  ClassPathXmlApplicationContext("spring.xml");
        DemoBean bean = container.getBean(DemoBean.class);
        System.out.println(bean);
        bean.m();
        
    }
}

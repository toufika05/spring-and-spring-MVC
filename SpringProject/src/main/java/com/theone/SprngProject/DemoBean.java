  package com.theone.SprngProject;

public class DemoBean {
	
	int age;
	String name;
	
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

public DemoBean(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}
	
	

	public void m(){
      System.out.println("m() non static property of demobean");
      System.out.println("name:"+name);
      System.out.println("Age:"+age);
	}



}








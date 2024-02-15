package com.theone.SprngProject.autoware;

public class Demo1 {
	private Demo2 d2;
	
   
	public void setD2(Demo2 d2) {
		this.d2 = d2;
	}

    public void m1() {
    	d2.m2();
    	System.out.println(" m1() of Demo1");
    }
}

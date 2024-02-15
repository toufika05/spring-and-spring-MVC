package com.theone.sp.demoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Demo2 {
	@Autowired
	Demo1 d;
	public void m2() {
		d.m1();
		System.out.println("m2() is method of Demo2");
	}

}

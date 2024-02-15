package com.theone.SprngProject.di;

public class car {
  Engine e;
  
//  public Engine getE() {
//	return e;
//}
//
//public void setE(Engine e) {
//	this.e = e;
//}
  
  public car(Engine e) {
		super();
		this.e = e;
	}
public void drive() {
	  e.start();
	  System.out.println("now you can drive your car");
  }

}

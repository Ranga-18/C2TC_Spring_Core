package com.tnsif.springdemo;

public class Airtel implements Mobile {
  @Override
  public void call() {
	  System.out.println("Airtel Call");
  }
  public void data() {
	  System.out.println("Airtel Data");
  }
}

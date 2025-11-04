package com.tnsif.springdemo;

public class Jio implements Mobile{
	@Override
	public void call() {
		System.out.println("Jio call");
	}
    public void data() {
    	System.out.println("Jio data");
    }
}

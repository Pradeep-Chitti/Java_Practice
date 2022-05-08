package com.xworkz.costructor;

public class Car {
	
	// non-parameterized custom constructor
	Car(){
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		System.out.println("Start");
		
		Car car=new Car();    //we create an object automatically Constructor call
		
		System.out.println("End");
	}

}

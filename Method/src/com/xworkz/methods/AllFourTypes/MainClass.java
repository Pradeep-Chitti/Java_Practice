package com.xworkz.methods.AllFourTypes;

public class MainClass {

	public static void main(String[] args) {
 
		All all=new All();
		all.m1();
		System.out.println("========================");
		all.m2(10, 10);
		System.out.println("=========================");
		String result=all.m3();
		System.out.println(result);
		System.out.println("==========================");
		String result1=all.m4("Name:"+"Ganesh "+"Age: ", 23);
		System.out.println(result1);
	}

}

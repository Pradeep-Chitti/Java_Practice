package com.xworkz.methods;

public class Method1 {
	
//	 Method without using arguments and without return statements
			void display() {
			System.out.println("Hello");
			}
			void mobile() {
				System.out.println("OnePlus");
			}
			public static void main(String[] args) {
				System.out.println("Start");
				Method1 M1=new Method1();
				M1.display();
				Method1 M2=new Method1();
				M2.mobile();
				System.out.println("End");
			}

}

package com.xworkz.methods.AllFourTypes;

public class All {
	
	// without arguments and without return type
	void m1(){
		System.out.println("Hi");
	}
	
	// with arguments and without return type

	void m2(int a, int b ){
		 int sum = a+b;
		 System.out.println("Sum of : " +a+ " and "+b +" is " +sum);
	}
	
	// without arguments and with return type

		String m3() {
			return "Pradeep";
			
		}
		// with arguments and with return type
	String	m4(String name,int age){
			return name+age ;
		}
}

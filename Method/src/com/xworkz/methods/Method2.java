package com.xworkz.methods;

public class Method2 {
//	 method with arguments and without return type
		 void add(int a,int b) {
			int sum=a+b;
			System.out.println("sum of  " +a+ " and  "+b+ " is  " +sum);
		 }
		public static void main(String []args) {
			 Method2 obj=new Method2();
			 
			 obj.add(70, 77);
			 obj.add(50, 50);
			 obj.add(1250, 1250);
			 
		 }
		

}


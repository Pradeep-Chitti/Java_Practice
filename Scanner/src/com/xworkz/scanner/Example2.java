package com.xworkz.scanner;
import java.util.Scanner;
public class Example2 {
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 
		 	System.out.println("Enter Name : ");
		 	String Name= scan.next();
	
		 	System.out.println("Enter age : ");
		 	int age=scan.nextInt();
		
		 	System.out.println("Sallary");
			double sallary=scan.nextDouble();
		
			System.out.println("Working  hard? ");
			boolean work=scan.nextBoolean();

			System.out.println("enter the name");
			String name =scan.next();
		
			char	a=name.charAt(1);
			System.out.println(a);
		
			scan.close();
	}

}

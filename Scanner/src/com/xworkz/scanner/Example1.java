package com.xworkz.scanner;

import java.util.Scanner;  // Step -->3 import the Scanner from util package
public class Example1 {

	public static void main(String[] args) {

		/* if we create a Scanner Object there are 3 Steps */
		// Step 1-->Create a Scanner Object
		// Step 2--> To passing System.in  
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the value a: ");
		int a=scan.nextInt();  //nextInt() is used to accept the inputs from the user
		//if we initilize the value to use , Example--> int a=scan.nextInt();
		
		System.out.println("Enter the value b: ");
		int b=scan.nextInt();
		 
		
		System.out.println( "Multiplicatio of  a and b is: "+a*b);
		scan.close();
		//  if this scanner has not yet been closed then if its underlying
	}

}

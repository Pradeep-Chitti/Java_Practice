package com.xworkz.ApartmentDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

public class ApartmetDTO {
	private int id;
	private String name;
	private int noOfFlats ;
	private int price;
	 
	
//	public void ApartmentDTO(){
//		
//		
//		
//	} 
//	public void saveApartment(ApartmetDTO dto) {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter id to save the Apartment Id");
//		int id=sc.nextInt();
//		System.out.println("Enter the name to save the Apatment Name");
//		String name=sc.next();
//		System.out.println("Enter the noOfFlats ");
//		int flats=sc.nextInt();
//		System.out.println("Enter the Price");
//		int price=sc.nextInt();
//		sc.close();
//		
//		java.sql.Statement statement=null;
//		Connection connection=null;
//	
//	
//	try {
//		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie.apartment","root","root");
//       System.out.println("Connection connected");
//       
//       
//       statement=connection.createStatement();
//       System.out.println("Statement Created");
//       
//       statement.execute("INSERT INTO movie.apartmentdto VALUES("+id+",'"+name+"',"+flats+","+price+")");
//	
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//
//}private static void UpdatePriceByName(double price,String name) {
	
public static void insertApartment() {	
	Scanner sc =new Scanner(System.in);
	System.out.println("Insert Apartment Id");
	int id=sc.nextInt();
	System.out.println("Insert Apatment Name");
	String name1=sc.next();
	System.out.println("Insert the noOfFlats ");
	int flats=sc.nextInt();
	System.out.println("Insert the Price");
	int price1=sc.nextInt();
	sc.close();
	
	java.sql.Statement statement=null;
	Connection connection=null;


try {
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie.apartment","root","root");
   System.out.println("Connection connected");
   
   
   statement=connection.createStatement();
   System.out.println("Statement Created");
   
   statement.execute("INSERT INTO movie.apartmentdto VALUES("+id+",'"+name1+"',"+flats+","+price1+")");

} catch (SQLException e) {
	e.printStackTrace();
}
finally {
	try {
		if(statement !=null)
			statement.close();
		if(connection !=null)
			connection.close();
	}
	catch (Exception e2) {
	e2.printStackTrace();
	}

}
}

//	private static void UpdatePriceByName(double price,String name) {
//		
//		
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter id to save the Apartment Id");
//		int id=sc.nextInt();
//		System.out.println("Enter the name to save the Apatment Name");
//		String name1=sc.next();
//		System.out.println("Enter the noOfFlats ");
//		int flats=sc.nextInt();
//		System.out.println("Enter the Price");
//		int price1=sc.nextInt();
//		sc.close();
//		
//		java.sql.Statement statement=null;
//		Connection connection=null;
//	
//	
//	try {
//		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/apartment","root","root");
//       System.out.println("Connection connected");
//       
//       
//       statement=connection.createStatement();
//       System.out.println("Statement Created");
//       
//       statement.execute("UPDATE apartmentdto price where name= SET("+id+",'"+name1+"',"+flats+","+price1+")");
//	
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//	finally {
//		try {
//			if(statement !=null)
//				statement.close();
//			if(connection !=null)
//				connection.close();
//		}
//		catch (Exception e2) {
//		e2.printStackTrace();
//		}
//
//}
//	}



	
	public static void main(String[] args) {
		insertApartment();
	
}}
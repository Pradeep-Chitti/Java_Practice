package MethodOverloading;

public class MethodOverloading {
	
public static  int id= 0;
//	No arguments
	public void display() {
		System.out.println("Hello");
	}
//	one arguments with int data type
	public void display(int x) {
		System.out.println(x);
	 }
//	 one argument with different data type
	public void display(double x) {
		 System.out.println(x);
	 }
//	 two arguments with different Data types
	 public void display(int x,String y) {
		
	 System.out.println(x+" "+y);

	 }
//	 two arguments with different data types and Different in sequence
	public  void display(String y,int x) {
		 System.out.println(x+" "+y);
	
	 }

}

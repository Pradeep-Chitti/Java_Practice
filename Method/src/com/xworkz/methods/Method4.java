package com.xworkz.methods;

public class Method4 {
	//Method with arguments and with return type
	
	 int square(int a, int b){
		 return a*b;
	 }
	 
	 String NameAdress(String a,String b) {
		 System.out.println("Name :"+a+ "  "+ "Address :"+b);
		 
		 return a+b;
	 }
	 
	 public static void main(String[] args) {
		
		 Method4 obj=new Method4();
		 Method4 obj2=new Method4();
		 
		int  result=obj.square(20, 20);
		  System.out.println(result);
		  
		String result2=  obj2.NameAdress("Pradeep "," Arakalachitti");
		  System.out.println(result2);
		 
	}

}

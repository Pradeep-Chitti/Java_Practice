package com.xworkz.methods;

public class Method3 {
		// Method without arguments and with return type
	 	int display(){
	 		return 10;
	 	}
	 	String Name() {
			return "Pradeep";
	 		
	 	}
	 	public static void main(String[] args) {
	 		
	 		System.out.println("Start");
	 		
			Method3 obj=new Method3();
			 
			int result=obj.display();
			System.out.println(result);
			
			String result1=obj.Name();
			System.out.println(result1);
			
			System.out.println("End");
			
		}

}

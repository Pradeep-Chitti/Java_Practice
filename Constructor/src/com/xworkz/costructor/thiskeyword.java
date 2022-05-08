package com.xworkz.costructor;

public class thiskeyword {
	int age;
	String name;
	
	thiskeyword(int age,String name){
	 this.age=age;
	 this.name=name;
	}
	public static void main(String[] args) {
		thiskeyword st=new thiskeyword(20,"Pradeep");
		thiskeyword st1=new thiskeyword(23,"Ganesh");
		
		System.out.println("Name : "+st.name+ "  "+"Age : "+st.age);
		System.out.println("Name : "+st1.name+ "  "+"Age : "+st1.age);


	}
	
	

}

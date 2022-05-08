package com.xworkz.costructor;

public class Student {
	 int age;
	 Student(int a){
		 age=a;
	 }
	 public static void main(String[] args) {
		Student st=new Student(23);
		Student st1=new Student(20);

		
		System.out.println("age : "+st.age);
		System.out.println("age : "+st1.age);
	}
}

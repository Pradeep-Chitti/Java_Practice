package com.xworkz.staticnonstatic;

public class StaticNonStatic {
	
	int age=23;
	
	void college(){
		System.out.println("bvvs");
	}
	static String  place="BGK"; 
	static void subject()
	{
		System.out.println("PCMB");
	}
	public static void main(String[] args) {
		StaticNonStatic st=new StaticNonStatic();
		System.out.println(st.age);
		st.college();
		
		System.out.println("==============");
		
		System.out.println(StaticNonStatic.place);
		StaticNonStatic.subject();
	
		
	}

}

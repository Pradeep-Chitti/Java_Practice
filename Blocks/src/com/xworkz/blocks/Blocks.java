package com.xworkz.blocks;

public class Blocks {
	static {
		System.out.println("Static block-1");
	}
	static {
		System.out.println("Static block-2");
	}
		public static void main(String[] args) {  
			System.out.println("Hello");
		}
		static {
			System.out.println("Static block-3");
		}
		//first execute static blocks later main method checks

}

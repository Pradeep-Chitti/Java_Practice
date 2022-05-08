
import java.util.Scanner;

class EvenOrOdd{

public static void main(String []args){

		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
	    num=sc.nextInt();
		if( num%2==0)
		{
		System.out.println(num+" "+"is even");
		}
		else
		{
		System.out.println(num+" " +"is Odd");
		}
		
	//	Largest  Number
	
		int a=200;
		int b=100;
		
		if(a>b)
			{
			System.out.println("a:"+a+" "+"b:"+b);
			if(a>b)
			{
				System.out.println("a is larger");
			}
				else if(a<b)
				{
					System.out.println("b is larger");
				}
				else
				{
					System.out.println("a and b are equals");
				}
			}
		
			}
}

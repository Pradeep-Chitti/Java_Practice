class LargestOfThreeNumber
{
	public static void main(String []args)
	{
			int a=500;
			int b=200;
			int c=250;
			
			 System.out.println("a:"+a+" b:"+b+ " c:"+c);
			if(a>b && a>c)
			{
				System.out.println("a is larger");
			}
			 else if(b>a && b>c)
			{
				System.out.println("b is larger");
			}
			else
			{
				System.out.println("c is larger");
			}
	}
}

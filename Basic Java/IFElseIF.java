class IFElseIF
{
		public static void main (String []args)
		{
		
		int a=10;
		int b=20;
		
		
		if(a<b) //if(10<20) -> true
		{
				System.out.println(a+" "+ "is lesser than"+b);
		}
		else if(a>b) //if(10>20) -> false           //we may take a lot of else_if statements ,to check statement one bye one
		{
				System.out.println(a+ " "+ "is grater than "+b);

		}
		else if(a==b) //if(10=10) ->false
		{
				System.out.println(a+ " "+ "is eqaul to "+b);

		}
		else                    					//else is not mandatory
		{
				System.out.println("nn");

		}
		}
		}
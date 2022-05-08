class MatrimoneyPortal
{
	public static void main(String []args)
	{
		char gender='M';
		int age=17;
		
		if(gender=='M')
		{
			System.out.println("Gender is male");
		
		if(age>=21)
		{
			System.out.println("Yes, you can get married");
		}
		else
		{
			System.out.println("Have Patients");
		}
		}
		 else if(gender=='F')
		{
			System.out.println("Gender is female");
		
		  if(age>=18)
		{
			System.out.println("Yes, you can get married");
		}
			else
			{
			System.out.println("Have Patients");
			}
		}
			else
			{
			System.out.println("Not elgible");

			}
	}
}
class LoginValidation
{
	public static void main(String []args)
	{
		String Id="Pradeep";
		int Password=123;
		
		if(Id=="Pradeep")
		{
				System.out.println("Id is valid");		
				

				if(Password==123)
					{
					System.out.println("Password is valid");
					}
				else
				 {
				System.out.println("Password is Invalid");
				System.out.println("Login Unsuccessful");
				}
		}
		else
		{
				System.out.println("Login Unsuccessful");
		}
	
	}	
}
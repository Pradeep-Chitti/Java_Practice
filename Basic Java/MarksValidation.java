class MarksValidation
{
		public static void main (String []args)
		{
		double marks =85.92;
		
		if(marks>=81 && marks<=100)
		{
				System.out.println("Distinction");
		}
		else if(marks>=0 && marks<=35)
		{
				System.out.println("Fail !! Better luck next Time !!");

		}
		else if(marks>=35 && marks<=80)
		{
				System.out.println("Fisrt Class");

		}
		else
		{
				System.out.println("Invalid Result");

		}

		}
}
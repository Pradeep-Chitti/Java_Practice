 import java.util.Scanner;
class Switch
{
		public static void main(String []args)
		{
			int choice;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: System.out.println("Gobi");
						break;
			
			case 2: System.out.println("Pani-Puri");
						break;
			case 3: System.out.println("Frid-Rice");
						break;
			default:System.out.println("Item is not available");

		
			}
		}

}
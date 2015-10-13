import java.util.Scanner;


public class SortStudents
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
		{
			askHowToSort();
		}
		private static void askHowToSort()
			{
				System.out.println("You chose to sort students, please specify.");
				System.out.println("    (1) sort students by first name. ");
				System.out.println("    (2) sort students by last name. ");
				System.out.println("    (3) sort students by GPA. ");
				System.out.println("    (4) Return to home menu ");
				int choice = userInput.nextInt();
				if(choice == 1)
					{
						System.out.println("This is where the add student method will go");
					}
				if(choice == 2)
					{
						System.out.println("This is where the delete student method will go");
					}
				if( choice == 3)
					{
						System.out.println("This is where the method for GPA will go.");
					}
				if(choice == 4)
					{
					 runner.welcome();
					}
				
			}
	}

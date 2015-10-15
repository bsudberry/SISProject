import java.util.Scanner;


public class AddOrDeleteStudent
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				askQuestion();
			}

		private static void askQuestion()
			{
				System.out.println("You chose to delete or add a student, please specify.");
				System.out.println("    (1) Delete student ");
				System.out.println("    (2) Add student ");
				System.out.println("    (3) Return to home menu ");
				int choice = userInput.nextInt();
				if(choice == 1)
					{
						addStudent.addsStudentToList();
					}
				if(choice == 2)
					{
						deleteStudent.deleteStudentFromList();
					}
				if(choice == 3)
					{
					 runner.welcome();
					}
			}
	}
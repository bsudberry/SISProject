import java.util.Scanner;


public class runner
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				welcome();
			
			}
		static void welcome()
			{
				System.out.println("What would you like to do?");
				System.out.println("    (1) Add or delete student");
				System.out.println("    (2) Change students grade or schedule");
				System.out.println("    (3) Sort students");
				int choice = userInput.nextInt();
				if(choice == 1)
					{
						AddOrDeleteStudent.askQuestion();
					}
				if(choice == 2)
					{
						System.out.println("Change students grade or schedule");
						ChangeStudentGradeSchedule.subMenuChangeGradeSchedule();
					}
				if(choice == 3)
					{
						SortStudents.askHowToSort();
					}
				
			}
	}
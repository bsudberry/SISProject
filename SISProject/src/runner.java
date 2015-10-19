import java.io.IOException;
import java.util.Scanner;


public class runner
	{
		public static boolean keepGoing = true;
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
			try {
				Student.fillClass();
				} 
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
			System.out.println("Hello, welcome to the SIS (Or Student Information System)");
				while (keepGoing)
				welcome();
			
			}
		static void welcome()
			{
				
				SortStudents.findGPA();
				System.out.println("What would you like to do?");
				System.out.println("    (1) Add or delete student");
				System.out.println("    (2) Change students grade or schedule");
				System.out.println("    (3) Sort students");
				System.out.println("    (4) Stop");
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
				if(choice == 4)
				{
					keepGoing = false;
					System.out.println("Thank you, have a good day!");
				}
				
				else
				{
					System.out.println("That's not a valid option, please choose again.");
					welcome();
				}
				
			}
		
		public static void printStudents()
		{
			System.out.println();
			System.out.println("-------------------------------------------------------");
			for (int i = 0; i < Student.Class.size(); i ++)
			{
				System.out.print(i+1 + ") " + Student.Class.get(i).getFirstName() + " " + Student.Class.get(i).getLastName() + " ");
				System.out.printf("%1.2f", Student.Class.get(i).getGradePointAverage());
				System.out.println(" " + Student.Class.get(i).getFirstClass() +" "+ Student.Class.get(i).getFirstGrade() +" "+ Student.Class.get(i).getSecondClass() +" "+ Student.Class.get(i).getSecondGrade() +" "+ Student.Class.get(i).getThirdClass() +" "+ Student.Class.get(i).getThirdGrade());
			}
			System.out.println("-------------------------------------------------------");
			System.out.println();
		}
	}
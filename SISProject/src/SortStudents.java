import java.util.*;
import java.io.*;


public class SortStudents
	{
		
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
		{
			askHowToSort();
		}
		public static void askHowToSort()
			{
				System.out.println("You chose to sort students, please specify.");
				System.out.println("    (1) Sort students by last name. ");
				System.out.println("    (2) Sort students by GPA name. ");
				System.out.println("    (3) Sort students by GPA. ");
				System.out.println("    (4) Return to home menu. ");
				int choice = userInput.nextInt();
				if(choice == 1)
					{
						sortLastName();
					}
				if(choice == 2)
					{
						sortGPA();
					}
				if( choice == 3)
					{
						sortClass();
					}
				if(choice == 4)
					{
					 runner.welcome();
					}
				
			}
		
		
		public static void sortLastName()
		{
			Collections.sort(Student.Class, new NameCompare());
		}
		
		public static void sortGPA()
		{
			Collections.sort(Student.Class, new GPACompare());	
		}
		
		public static void sortClass()
		{
			//Collections.sort(Student.Class, new ClassCompare());
		}
		
	}

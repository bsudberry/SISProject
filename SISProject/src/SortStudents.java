import java.util.*;
import java.io.*;


public class SortStudents
	{
		public static double calcGPA = 0;
		public static double calcFirstGr = 0;
		public static double calcSecondGr = 0;
		public static double calcThr = 0;
		
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
		{
			askHowToSort();
		}
		public static void askHowToSort()
			{
				System.out.println("You chose to sort students, please specify.");
				System.out.println("    (1) Sort students by last name. ");
				System.out.println("    (2) Sort students by GPA. ");
				System.out.println("    (3) Sort students by class. ");
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
			runner.printStudents();
		}
		
		public static void sortGPA()
		{
			Collections.sort(Student.Class, new GPACompare());	
		}
		
		public static void sortClass()
		{
			//Collections.sort(Student.Class, new ClassCompare());
		}
		
		public static void findGPA()
		{
			
			
			
			
			
			
		}
		
	}

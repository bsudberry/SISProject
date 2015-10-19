import java.util.*;
import java.io.*;


public class SortStudents
	{
		public static double calcGPA = 0;
		public static double calcFirstGr = 0;
		public static double calcSecondGr = 0;
		public static double calcThirdGr = 0;
		
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
				else
				{
				System.out.println("That is not a valid choice, please choose again.");
				askHowToSort();
				}
				
			}
		
		
		public static void sortLastName()
		{
			Collections.sort(Student.Class, new NameCompare());
			runner.printStudents();
		}
		
		public static void sortGPA()
		{
			findGPA();
			Collections.sort(Student.Class, new GPACompare());	
			runner.printStudents();
		}
		
		public static void sortClass()
		{
			Collections.sort(Student.Class, new ClassCompare());
			runner.printStudents();
		}
		
		public static void findGPA()
		{
			for (int i = 0; i < Student.Class.size(); i++)
			{
			calcFirstGr = 0.0;	
			calcSecondGr = 0.0;	
			calcThirdGr = 0.0;	
			switch (Student.Class.get(i).getFirstGrade().substring(0,1))
			{
			
			case "A":
			{
				calcFirstGr = 4.0;
				break;
			}
			
			case "B":
			{
				calcFirstGr = 3.0;
				break;
			}
			
			case "C":
			{
				calcFirstGr = 2.0;
				break;
			}
			
			case "D":
			{
				calcFirstGr = 1.0;
				break;
			}
			
			case "F":
			{
				calcFirstGr = 0.0;
				break;
			}
			}
			
			switch (Student.Class.get(i).getSecondGrade().substring(0,1))
			{
			
			case "A":
			{
				calcSecondGr = 4.0;
				break;
			}
			
			case "B":
			{
				calcSecondGr = 3.0;
				break;
			}
			
			case "C":
			{
				calcSecondGr = 2.0;
				break;
			}
			
			case "D":
			{
				calcSecondGr = 1.0;
				break;
			}
			
			case "F":
			{
				calcSecondGr = 0.0;
				break;
			}
			}
			
			switch (Student.Class.get(i).getThirdGrade().substring(0,1))
			{
			
			case "A":
			{
				calcThirdGr = 4.0;
				break;
			}
			
			case "B":
			{
				calcThirdGr = 3.0;
				break;
			}
			
			case "C":
			{
				calcThirdGr = 2.0;
				break;
			}
			
			case "D":
			{
				calcThirdGr = 1.0;
				break;
			}
			
			case "F":
			{
				calcThirdGr = 0.0;
				break;
			}
			}
			
			Student.Class.get(i).setGradePointAverage((calcSecondGr + calcFirstGr + calcThirdGr) / 3);
			
			}
			
			
		}
			
		
			
			
			
			
			
		}
		
	

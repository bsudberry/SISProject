import java.util.Scanner;


public class AddOrDeleteStudent
	{
	public static String test;
	public static String newFirstName = "";
	public static String newLastName = "";
	public static String newFirstClass = "";
	public static String newSecondClass = "";
	public static String newThirdClass= "";
	public static String newSecondGr = "";
	public static String newThirdGr= "";
	public static String newFirstGr = "";
	public static double newGPA = 0.0;
	public static int removedStudent = 0;
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				
				askQuestion();
			}

		static void askQuestion()
			{
			
				System.out.println("You chose to delete or add a student, please specify.");
				System.out.println("    (1) Add student ");
				System.out.println("    (2) Delete student ");
				System.out.println("    (3) Return to home menu ");
				int choice = userInput.nextInt();
				if(choice == 2)
					{
						deleteStudent();
					}
				if(choice == 1)
					{
						addStudent();
					}
				if(choice == 3)
					{
						runner.welcome();
					}
			}
		
		public static void addStudent()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Add a student.");
			System.out.println("First Name?");
			newFirstName = userInput.nextLine();
			System.out.println("Last Name?");
			newLastName = userInput.nextLine();
			System.out.println("First Class?");
			newFirstClass = userInput.nextLine();
			System.out.println("Grade in that Class?");
			newFirstGr = userInput.nextLine();
			System.out.println("Second Class?");
			newSecondClass = userInput.nextLine();
			System.out.println("Grade in that Class?");
			newSecondGr = userInput.nextLine();
			System.out.println("Third Class?");
			newThirdClass = userInput.nextLine();
			System.out.println("Grade in that Class?");
			newThirdGr = userInput.nextLine();
			Student.Class.add(new Student (newFirstName,newLastName,newGPA,newFirstClass.substring(0,1).toUpperCase()+newFirstClass.substring(1),newFirstGr.toUpperCase(),newSecondClass.substring(0,1).toUpperCase()+newSecondClass.substring(1),newSecondGr.toUpperCase(),newThirdClass.substring(0,1).toUpperCase()+newThirdClass.substring(1),newThirdGr.toUpperCase()));
			SortStudents.findGPA();
			runner.printStudents();
		}
		
		public static void deleteStudent()
		{
			Scanner userInput = new Scanner (System.in);
			System.out.println("Name the position of the student you wish to delete. (1 being the first)");
			runner.printStudents();
			removedStudent = userInput.nextInt();
			Student.Class.remove(removedStudent - 1);
			
			System.out.println("OKAY, here is the updated list!");
			System.out.println("======================================================");
			runner.printStudents();
		}
		
		
	}
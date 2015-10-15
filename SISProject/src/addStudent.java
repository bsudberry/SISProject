import java.util.Scanner;


public class addStudent
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
			addsStudentToList();
			}

		static void addsStudentToList()
			{
				System.out.println("What is the students first name?");
				String firstName = userInput.nextLine();
				System.out.println("What is the students last name?");
				String lastName = userInput.nextLine();
				System.out.println("What is the students first period class?");
				System.out.println("    (1) AP United States History");
				System.out.println("    (2) Honors Statistics");
				System.out.println("    (3) AP Computer Science");
				int periodOne = userInput.nextInt();
				System.out.println("What is the students second period class?");
				System.out.println("    (1) AP United States History");
				System.out.println("    (2) Honors Statistics");
				System.out.println("    (3) AP Computer Science");
				int periodTwo = userInput.nextInt();
				System.out.println("What is the students third period class?");
				System.out.println("    (1) AP United States History");
				System.out.println("    (2) Honors Statistics");
				System.out.println("    (3) AP Computer Science");
				int periodThree = userInput.nextInt();
			}

	}

import java.util.Scanner;


public class addStudent
	{
		private static final String period1 = null;
		private static final String period2 = null;
		private static final String period3 = null;
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
			addsStudentToList();
			String period1;
			String period2;
		    String period3;
			}

		static void addsStudentToList()
			{
				System.out.println("What is the students first name?");
				String firstName = userInput.nextLine();
				System.out.println("What is the students last name?");n  
				String lastName = userInput.nextLine();
				System.out.println("What is the students first period class?");
				System.out.println("    (1) AP United States History");
				System.out.println("    (2) Honors Statistics");
				System.out.println("    (3) AP Computer Science");
				int periodOne = userInput.nextInt();
				if(periodOne == 1)
					{
						String period1 = ("English");
					}
				if(periodOne == 2)
					{
						String period1 = ("Algebra");
					}
				if(periodOne == 3)
					{
						String period1 = ("Biology");
					}
				System.out.println("What is the students second period class?");
				System.out.println("    (1) AP United States History");
				System.out.println("    (2) Honors Statistics");
				System.out.println("    (3) AP Computer Science");
				int periodTwo = userInput.nextInt();
				if(periodTwo == 1)
					{
						String period2 = ("English");
					}
				if(periodTwo == 2)
					{
						String period2 = ("Algebra");
					}
				if(periodTwo == 3)
					{
						String period2 = ("Biology");
					}
				System.out.println("What is the students third period class?");
				System.out.println("    (1) AP United States History");
				System.out.println("    (2) Honors Statistics");
				System.out.println("    (3) AP Computer Science");
				int periodThree = userInput.nextInt();
				if(periodThree == 1)
					{
						String period3 = ("English");
					}
				if(periodThree == 2)
					{
						String period3 = ("Algebra");
					}
				if(periodThree == 3)
					{
						String period3 = ("Biology");
					}
				System.out.println(firstName + lastName + period1);
				
				
			}

	}

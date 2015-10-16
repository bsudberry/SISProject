import java.util.Scanner;

public class ChangeStudentGradeSchedule
	{
	public static int position = 0;
	public static int class1;
	public static int class2;
	public static String swap1;
	public static String swap2;
	public static String swap3;
	public static String swap4;
	
	public static int position1 = 0;
	public static int choice;
	public static int classChoice;
	public static String gradeChange;
	public static void subMenuChangeGradeSchedule()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("    (1) Change student's grade");
		System.out.println("    (2) Change student's schedule");
		System.out.println("    (3) Return to main menu");
		choice=userInput.nextInt();
		if(choice==1)
			{
			changeGrade();
			}
		else if(choice==2)
			{
			changeSchedule();
			}
		else if(choice==3)
			{
			runner.welcome();
			}
		}
	public static void changeGrade()
		{
		position1 = 0;
		Scanner userInput = new Scanner(System.in);
		Scanner userInput2 = new Scanner(System.in);
		runner.printStudents();
		System.out.println("Enter the number of the student that you would like to change the grade of.");
		position1= userInput.nextInt();
		System.out.println("For what class, (1), (2), or (3), would you like to change the grade?");
		classChoice = userInput.nextInt();
		if(classChoice==1)
			{
			System.out.println("What would you like to change their grade to?");
			gradeChange = userInput2.nextLine();
			Student.Class.get(position1-1).setFirstGrade(gradeChange.toUpperCase());
			SortStudents.findGPA();
			runner.printStudents();
			}
		else if(classChoice==2)
			{
			System.out.println("What would you like to change their grade to?");
			gradeChange = userInput2.nextLine();
			Student.Class.get(position1-1).setSecondGrade(gradeChange.toUpperCase());
			SortStudents.findGPA();
			runner.printStudents();
			}
		else if(classChoice==3)
			{
			System.out.println("What would you like to change their grade to?");
			gradeChange = userInput2.nextLine();
			Student.Class.get(position1-1).setThirdGrade(gradeChange.toUpperCase());
			SortStudents.findGPA();
			runner.printStudents();
			}
		else
			{
			System.out.println("What are you doing with your life? Redo it.");
			ChangeStudentGradeSchedule.subMenuChangeGradeSchedule();
			}
		}
	public static void changeSchedule()
		{
		position = 0;
		class1 = 0;
		class2 = 0;
		Scanner userInput = new Scanner (System.in);
		runner.printStudents();
		System.out.println("Please input the position of the Student whose schedule you'd like to alter.");
		position = userInput.nextInt();
		System.out.println("Now, input the period of the first class you'd like to switch.");
		class1 = userInput.nextInt();
		System.out.println("Now input the period you'd like to switch with period "+ class1 + ".");
		class2 = userInput.nextInt();
		
		if (class1 == 1 && class2 == 2)
		{
			swap1 = Student.Class.get(position-1).getFirstClass();
			swap2 = Student.Class.get(position-1).getSecondClass();
			swap3 = Student.Class.get(position-1).getFirstGrade();
			swap4 = Student.Class.get(position-1).getSecondGrade();
			Student.Class.get(position-1).setFirstClass(swap2);
			Student.Class.get(position-1).setSecondClass(swap1);
			Student.Class.get(position-1).setFirstGrade(swap4);
			Student.Class.get(position-1).setSecondGrade(swap3);
		}
		
		if (class1 == 1 && class2 == 3)
		{
			swap1 = Student.Class.get(position-1).getFirstClass();
			swap2 = Student.Class.get(position-1).getThirdClass();
			swap3 = Student.Class.get(position-1).getFirstGrade();
			swap4 = Student.Class.get(position-1).getThirdGrade();
			Student.Class.get(position-1).setFirstClass(swap2);
			Student.Class.get(position-1).setThirdClass(swap1);
			Student.Class.get(position-1).setFirstGrade(swap4);
			Student.Class.get(position-1).setThirdGrade(swap3);
		}
		
		
		if (class1 == 2 && class2 == 3)
		{
			swap1 = Student.Class.get(position-1).getSecondClass();
			swap2 = Student.Class.get(position-1).getThirdClass();
			swap3 = Student.Class.get(position-1).getSecondClass();
			swap4 = Student.Class.get(position-1).getThirdGrade();
			Student.Class.get(position-1).setSecondClass(swap2);
			Student.Class.get(position-1).setThirdClass(swap1);
			Student.Class.get(position-1).setSecondGrade(swap4);
			Student.Class.get(position-1).setThirdGrade(swap3);
		}
		
		runner.printStudents();
		
		
		
		
		}
	}
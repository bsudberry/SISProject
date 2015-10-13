import java.util.Scanner;

public class ChangeStudentGradeSchedule
	{
	static Scanner userInput = new Scanner(System.in);
	static int choice;
	public static void subMenuChangeGradeSchedule()
		{
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
		System.out.println("This is where the grade will be changed");
		System.out.println("Which student's grade would you like to change?");
		}
	public static void changeSchedule()
		{
		System.out.println("This is where the schedule will be changed");
		System.out.println("Which student's schedule would you like to change?");
		}
	}
import java.util.Scanner;

public class ChangeStudentGradeSchedule
	{
	
	static int choice;
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
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the last name of the student that you would like to change the grade of.");
		String name= userInput.nextLine();
		System.out.println("For what class, (a), (b), or (c), would you like to change the grade?");
		String classChoice=userInput.nextLine();
		System.out.println("What would you like to change their grade to?");
		String gradeChange=userInput.nextLine();
		for(int i=0;i<Student.Class.size();i++)
			{
			if(Student.Class.get(i).getLastName().equals(name))
				{
				if(classChoice.contains("a"))
					{
					Student.Class.get(i).setFirstGrade(gradeChange);
					System.out.println(Student.Class.get(i));
					}
				else if(classChoice.contains("b"))
					{
					Student.Class.get(i).getSecondGrade(Student.Class.getSecondGrade().setSecondGrade(gradeChange));
					System.out.println(Student.Class.get(i));
					}
				else if(classChoice.contains("c"))
					{
					Student.Class.get(i).setThirdGrade(gradeChange);
					System.out.println(Student.Class.get(i));
					}
				}
			else
				{
				System.out.println("What are you doing with your life? Redo it.");
				ChangeStudentGradeSchedule.subMenuChangeGradeSchedule();
				}
			}
		}
	public static void changeSchedule()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("This is where the schedule will be changed");
		System.out.println("Which student's schedule would you like to change?");
		String scheduleChoice=userInput.nextLine();
		}
	}
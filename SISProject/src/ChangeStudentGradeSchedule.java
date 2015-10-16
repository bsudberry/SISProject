import java.util.Scanner;

public class ChangeStudentGradeSchedule
	{
	public static int position = 0;
	public static int class1;
	public static int class2;
	public static String swap1;
	public static String swap2;
	
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
					Student.Class.get(i).setSecondGrade(gradeChange);
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
			Student.Class.get(position-1).setFirstClass(swap2);
			Student.Class.get(position-1).setSecondClass(swap1);
		}
		
		if (class1 == 1 && class2 == 3)
		{
			swap1 = Student.Class.get(position-1).getFirstClass();
			swap2 = Student.Class.get(position-1).getThirdClass();
			Student.Class.get(position-1).setFirstClass(swap2);
			Student.Class.get(position-1).setThirdClass(swap1);
		}
		
		
		if (class1 == 2 && class2 == 3)
		{
			swap1 = Student.Class.get(position-1).getSecondClass();
			swap2 = Student.Class.get(position-1).getThirdClass();
			Student.Class.get(position-1).setSecondClass(swap2);
			Student.Class.get(position-1).setThirdClass(swap1);
		}
		
		runner.printStudents();
		
		
		
		
		}
	}
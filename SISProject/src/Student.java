import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Student
	{
		private String firstName;
		private String lastName;
		private double gradePointAverage;
		private String firstClass, secondClass, thirdClass;
		private String firstGrade, secondGrade, thirdGrade;
		static ArrayList<Student>Class=new ArrayList<Student>();
		public Student(String FN, String LN, double GPA, String FC, String FG, String SC, String SG, String TC, String TG)
			{
				firstName = FN;
				lastName = LN;
				gradePointAverage = GPA;
				firstClass = FC;
				firstGrade = FG; 
				secondClass = SC;
				secondGrade = SG;
				thirdClass = TC;
				thirdGrade = TG;
			}
		public static void Class()throws IOException
			{
				Scanner file = new Scanner(new File("studentlist3.txt"));
				
				while(file.hasNext())
					{
						String firstName= file.next();
						String lastName= file.next();
						double gradePointAverage= 0;
						String firstClass = file.next();
						String firstGrade= file.next();
						String secondClass= file.next();
						
					}
			}

		public String getFirstName()
			{
				return firstName;
			}

		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}

		public String getLastName()
			{
				return lastName;
			}

		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}

		public double getGradePointAverage()
			{
				return gradePointAverage;
			}

		public void setGradePointAverage(double gradePointAverage)
			{
				this.gradePointAverage = gradePointAverage;
			}

		public String getFirstClass()
			{
				return firstClass;
			}

		public void setFirstClass(String firstClass)
			{
				this.firstClass = firstClass;
			}

		public String getSecondClass()
			{
				return secondClass;
			}

		public void setSecondClass(String secondClass)
			{
				this.secondClass = secondClass;
			}

		public String getThirdClass()
			{
				return thirdClass;
			}

		public void setThirdClass(String thirdClass)
			{
				this.thirdClass = thirdClass;
			}

		public String getFirstGrade()
			{
				return firstGrade;
			}

		public void setFirstGrade(String firstGrade)
			{
				this.firstGrade = firstGrade;
			}

		public String getSecondGrade()
			{
				return secondGrade;
			}

		public void setSecondGrade(String secondGrade)
			{
				this.secondGrade = secondGrade;
			}

		public String getThirdGrade()
			{
				return thirdGrade;
			}

		public void setThirdGrade(String thirdGrade)
			{
				this.thirdGrade = thirdGrade;
			}
		


		
	}

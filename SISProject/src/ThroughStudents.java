import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class ThroughStudents
	{
		private String firstName;
		private String lastName;
		private double gradePointAverage;
		private String firstClass, secondClass, thirdClass;
		private String firstGrade, secondGrade, thirdGrade;
		static ArrayList<ThroughStudents>Class=new ArrayList<ThroughStudents>();
		public ThroughStudents(String FN, String LN, double GPA, String FC, String FG, String SC, String SG, String TC, String TG)
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
		public static void Students()throws IOException
			{
				
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

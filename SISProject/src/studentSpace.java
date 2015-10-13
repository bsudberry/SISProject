public class studentSpace
	{
		private String studentFirstName;
		private String studentLastName;
		private double GPA;
		private String grade;
		private String schedule;
		private String course;
		
		
		public studentSpace(String sFN, String sLN, String g, String s, String c, double GP)
			{
				studentFirstName = sFN;
				studentLastName = sLN;
				grade = g;
				schedule = s;
				course = c; 
				GPA = GP;
			}


		private String getStudentFirstName()
			{
				return studentFirstName;
			}


		private void setStudentFirstName(String studentFirstName)
			{
				this.studentFirstName = studentFirstName;
			}


		private String getStudentLastName()
			{
				return studentLastName;
			}


		private void setStudentLastName(String studentLastName)
			{
				this.studentLastName = studentLastName;
			}


		private double getGPA()
			{
				return GPA;
			}


		private void setGPA(double gPA)
			{
				GPA = gPA;
			}


		private String getGrade()
			{
				return grade;
			}


		private void setGrade(String grade)
			{
				this.grade = grade;
			}


		private String getSchedule()
			{
				return schedule;
			}


		private void setSchedule(String schedule)
			{
				this.schedule = schedule;
			}


		private String getCourse()
			{
				return course;
			}


		private void setCourse(String course)
			{
				this.course = course;
			}
	}

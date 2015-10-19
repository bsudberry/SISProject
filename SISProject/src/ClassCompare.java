import java.util.Comparator;
public class ClassCompare implements Comparator<Student>
{
	public int compare(Student c1, Student c2)
	{
		if (SortStudents.periodSort == 1)
		{
		return c1.getFirstClass().compareTo(c2.getFirstClass());
		}
		
		if (SortStudents.periodSort == 2)
		{
		return c1.getSecondClass().compareTo(c2.getSecondClass());	
		}
		
		else 
		{
			return c1.getThirdClass().compareTo(c2.getThirdClass());
		}
	}
}

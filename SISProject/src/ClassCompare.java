import java.util.Comparator;
public class ClassCompare implements Comparator<Student>
{
	public int compare(Student c1, Student c2)
	{
		return c1.getFirstClass().compareTo(c2.getFirstClass());
		
	}
}

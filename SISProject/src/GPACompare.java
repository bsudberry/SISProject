import java.util.*;
public class GPACompare implements Comparator<Student> 
{
	public int compare(Student gPA1, Student gPA2)
	{
		if (gPA1.getGradePointAverage() < gPA2.getGradePointAverage())
				{
			return 1;
				}
		else 
		{
			return -1;
		}
	}

}

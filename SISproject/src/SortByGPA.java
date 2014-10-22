import java.util.Comparator;

public class SortByGPA implements Comparator<Students>
	{
	public int compare(Students g1, Students g2)
		{
		if (g1.getGPA() < g2.getGPA())
			{
			return 1;
			} 
			else
			{
			return -1;
			}
		}
	}

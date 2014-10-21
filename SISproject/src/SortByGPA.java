import java.util.Comparator;

public class SortByGPA implements Comparator<Constructors>
	{
	public int compare(Constructors g1, Constructors g2)
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

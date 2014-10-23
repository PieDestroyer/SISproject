import java.util.Comparator;
import java.io.IOException;

public class SortByGPA implements Comparator<Students>
	{
	public static void Comparing() throws IOException
	{
	fillArray.createArraylist();
	makeGPA.createGPA();
	}
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

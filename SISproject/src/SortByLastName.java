import java.util.Comparator;
public class SortByLastName
	{
	public int compare(Students n1, Students n2)
		{
		return n2.getLastName().compareTo(n1.getLastName());
		}
	}

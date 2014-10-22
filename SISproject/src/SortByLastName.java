import java.util.Comparator;
public class SortByLastName
	{
	public int compare(Students n1, Students n2)
		{
		return n1.getLastName().compareTo(n2.getLastName());
		}
	}

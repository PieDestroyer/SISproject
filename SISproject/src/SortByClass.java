import java.util.Comparator;
public class SortByClass implements Comparator<Students>
	{
	public int compare(Students c1, Students c2, Students c3)
		{
		return c1.getClass1().compareTo(c2.getClass2());//.compareTo(c3.getClass3()));

		}
	}

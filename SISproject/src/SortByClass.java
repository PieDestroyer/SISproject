import java.util.Comparator;
public class SortByClass implements Comparator<Constructors>
	{
	public int compare(Constructors c1, Constructors c2, Constructors c3)
		{
		return c1.getClass1().compareTo(c2.getClass2().compareTo(c3.getClass3()));

		}
	}

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
public class SortByLastName implements Comparator<Students>
	{
	public int compare(Students n1, Students n2)
		{
		return n1.getLastName().compareTo(n2.getLastName());
		}
	}


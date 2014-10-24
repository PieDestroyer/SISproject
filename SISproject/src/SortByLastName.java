import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
public class SortByLastName implements Comparator<Students>
	{
	/*public static void Comparing() throws IOException
	{
	fillArray.createArraylist();
	//makeGPA.createGPA();
	}*/
	public int compare(Students n1, Students n2)
		{
		return n1.getLastName().compareTo(n2.getLastName());
		}
//	public static void SortingLastName(){
//	fillArray.createArraylist();
//	makeGPA.createGPA();
//	Collections.sort(Students.database);
//	System.out.println(Students.database);
//	}
	}

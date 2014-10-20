
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Constructors
	{
	private String firstName;
	private String lastName;
	private int Period1 = 1;
	private String class1;
	private String gradeClass1;
	private int Period2 = 2;
	private String class2;
	private String gradeClass2;
	private int Period3 = 3;
	private String class3;
	private String gradeClass3;
	
	static ArrayList <Constructors> database = new ArrayList <Constructors> ();
	
public Constructors(String f, String l, int p1, String c1, String g1, int p2, String c2, String g2, int p3, String c3, String g3)
{
	firstName = f;
	lastName = l; 
	Period1 = p1;
	class1 = c1;
	gradeClass1 = g1;
	Period2 = p2;
	class2 = c2;
	gradeClass2 = g2;
	Period3 = p3;
	class3 = c3;
	gradeClass3 = g3;
}

public void createArraylist() throws FileNotFoundException
{



Scanner file = new Scanner(new File("studentlist2.txt"));

while(file.hasNext())
{
	firstName = file.next();
	lastName = file.next();
	class1 = file.next();
	gradeClass1 = file.next();
	class2 = file.next();
	gradeClass2 = file.next();
	class3 = file.next();
	gradeClass3 = file.next();
	
	database.add(new Constructors(firstName, lastName, Period1, class1, gradeClass1, Period2, class2, gradeClass2, Period3, class3, gradeClass3));
	
}

	}
}

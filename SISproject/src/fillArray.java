import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class fillArray
	{

	
	public static void createArraylist() throws IOException
	{

	Scanner file = new Scanner(new File("studentlist2.txt"));

	while(file.hasNext())
	{
		String firstName = file.next();
		String lastName = file.next();
		int Period1 = 1;
		String class1 = file.next();
		String gradeClass1 = file.next();
		int Period2 = 2;
		String class2 = file.next();
		String gradeClass2 = file.next();
		int Period3 = 3;
		String class3 = file.next();
		String gradeClass3 = file.next();
		Double GPA = 0.0; 
		
		Students.database.add(new Students(firstName, lastName, Period1, class1, gradeClass1, Period2, class2, gradeClass2, Period3, class3, gradeClass3, GPA));
		
	}

		}
	
	
	
	}

import java.io.IOException;
import java.util.Scanner;

public class ChangeGrade
	{
	public static Scanner read = new Scanner(System.in);
	private static String choice;
	private static String lastNameCheck;
	private static String gradeNew;

	public static void changeGrade() throws IOException
		{
		fillArray.createArraylist();
		for(int x=0;x<Students.database.size(); x++)
			{
			System.out.println((x+1)+".)"+" "+Students.database.get(x));
			}
		System.out.println("What is the number");
		for(int i = 0; i < Students.database.size(); i++)
			{
			if (Students.database.get(i).getLastName().equals(lastNameCheck))
				{
				
				}
				
			}
		}
	}
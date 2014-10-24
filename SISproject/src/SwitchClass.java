import java.io.IOException;
import java.util.Scanner;


public class SwitchClass
	{

	public static Scanner read = new Scanner(System.in);
	private static int studentNumb;
	private static int change1;
	private static int change2;
	
public static void changeSchedule() throws IOException
{
	
	
	
	fillArray.createArraylist();
	for(int x=0;x<Students.database.size(); x++)
		{
		System.out.println((x+1)+".)"+" "+Students.database.get(x));
		}
	System.out.println("\nWhat is the number of the student you would like to change.");
	studentNumb=read.nextInt();
	System.out.println(Students.database.get(studentNumb-1));
	
	
	System.out.println("\nPlease enter the period of the class that you would like to change?");
	change1 = read.nextInt();
	System.out.println("\nWhich period would you like to switch period" + change1 + " with?");
	change2 = read.nextInt();
	
	if(change1 ==1)
	{
		if(change2 ==2)
		{
			Students.database.getFirstName();
		}
		if(change2 == 3)
		{
			
		}
	}
	
}
	
	
	
	}

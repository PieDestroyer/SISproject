import java.io.IOException;
import java.util.Scanner;
import java.util.Collections;


public class Main
	{
	// mine
	// commit from home
	
	public static void main(String[] args) throws IOException
		{
		int option;
		Scanner input = new Scanner(System.in);

		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("<1> Add or delete a student");
		System.out.println("<2> Change student grades or schedule");
		System.out.println("<3> Sort students");
		option = input.nextInt();
		if (option == 1)
			{
			AddOrDeleteStudent.Intro();
			}
		if (option == 2)
			{

			}
		if (option == 3)
			{
			System.out.println("What would you like to sort by?");
			System.out.println();
			System.out.println("<1> By class");
			System.out.println("<2> By GPA");
			System.out.println("<3> By last name");
			option = input.nextInt();
			if (option ==1)
				{
				Collections.sort(Students.database,new SortByClass());
				}
			if (option ==2)
				{
				fillArray.createArraylist();
				makeGPA.createGPA();
				
				Collections.sort(Students.database,new SortByGPA());
				System.out.println(Students.database);
				}
			if (option ==3)
				{
				//System.out.println(SortByLastName.SortingLastName);
				fillArray.createArraylist();
				makeGPA.createGPA();
				Collections.sort(Students.database,new SortByLastName());
				System.out.println(Students.database);
				}
			}

		}

	}
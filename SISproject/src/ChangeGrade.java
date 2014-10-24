import java.io.IOException;
import java.util.Scanner;

public class ChangeGrade
	{
	public static Scanner read = new Scanner(System.in);
	private static String choice;
	private static int studentNumb;
	private static String gradeNew;
	private static int classChoice;

	public static void changeGrade() throws IOException
		{
		fillArray.createArraylist();
		makeGPA.createGPA();
		for(int x=0;x<Students.database.size(); x++)
			{
			System.out.println((x+1)+".)"+" "+Students.database.get(x));
			}
		System.out.println("What is the number of the student you would like to change.");
		studentNumb=read.nextInt();
		System.out.println("What is the students new grade.");
		gradeNew=read.next();
		System.out.println("What period's grade would you like to change? 1, 2, or 3.");
		classChoice=read.nextInt();

		if(studentNumb<25)
			{
			
			if(classChoice==1)
				{
				Students.database.get(studentNumb-1).setGradeClass1(gradeNew);
				System.out.println(Students.database.get(studentNumb-1).getFirstName()+" "+Students.database.get(studentNumb-1).getLastName()+ " has a new grade for "+Students.database.get(studentNumb-1).getClass1()+", and that is "+gradeNew+".");
				}
			else if(classChoice==2)
				{
				Students.database.get(studentNumb-1).setGradeClass2(gradeNew);
				System.out.println(Students.database.get(studentNumb-1).getFirstName()+" "+Students.database.get(studentNumb-1).getLastName()+ " has a new grade for "+Students.database.get(studentNumb-1).getClass2()+", and that is "+gradeNew+".");
				}
			else if(classChoice==3)
				{
				Students.database.get(studentNumb-1).setGradeClass3(gradeNew);
				System.out.println(Students.database.get(studentNumb-1).getFirstName()+" "+Students.database.get(studentNumb-1).getLastName()+ " has a new grade for "+Students.database.get(studentNumb-1).getClass3()+", and that is "+gradeNew+".");
				}
			else
				{
				System.out.println("Sorry, that is not a period.");
				}
			}
		else
			{
			System.out.println("That is not a valid studnet number.");
			}
		}
	}

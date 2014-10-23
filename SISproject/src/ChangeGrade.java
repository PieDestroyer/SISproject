import java.util.Scanner;

public class ChangeGrade
	{
	public static Scanner read = new Scanner(System.in);
	private static String choice;
	private static String lastNameCheck;
	private static String gradeNew;

	public static void changeGrade() {
		System.out.println("What is the last name of the student whose grade you wish to change?");
		lastNameCheck = read.next();
		for (int i = 0; i < Students.database.size(); i++) 
			{
				if(Students.database.get(i).getLastName().equals(lastNameCheck)) 
					{
						System.out.println("What period's grade would you like to change. ex. 1, 2, or 3");
						int periodChoice = read.nextInt();
						System.out.println("What would you to change the grade of Mr. or Ms. "+ Students.database.get(i).getLastName() + " to");
						String gradeNew = read.next();
						if (periodChoice == 1) 
							{
								Students.database.get(i).setGradeClass1(gradeNew);
							}
						else if(periodChoice == 2)
							{
								Students.database.get(i).setGradeClass2(gradeNew);
							}
						else if(periodChoice == 3)
							{
								Students.database.get(i).setGradeClass3(gradeNew);
							}
						else
							{
								System.out.println("Sorry, that is not an option");
							}
					}
				else
					{
					System.out.println("Sorry, that is not a valid last name.");
					}
		}
	}
}
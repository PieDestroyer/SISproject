import java.io.IOException;
import java.util.Scanner;

public class AddOrDeleteStudent
	{

	public static void main(String[] args) throws IOException
		{
		Intro();
		AddStudent();
		DeleteStudent();
		}

	public static void Intro() throws IOException
		{
		int option;
		Scanner input = new Scanner(System.in);
		System.out.println("<1> Add student");
		System.out.println("<2> Delete student");
		option = input.nextInt();
		if (option == 1)
			{
			AddStudent();
			}
		if (option == 2)
			{
			DeleteStudent();

			}
		}

	public static void AddStudent() throws IOException
		{
		fillArray.createArraylist();
		String firstName;
		String lastName;
		int Period1 = 1;
		String class1;
		String grade1;
		int Period2 = 2;
		String class2;
		String grade2;
		int Period3 = 3;
		String class3;
		String grade3;
		double GPA = 0.0;

		Scanner input = new Scanner(System.in);
		System.out.println("First name?");
		firstName = input.nextLine();
		System.out.println("Last name?");
		lastName = input.nextLine();
		System.out.println("Class 1?");
		class1 = input.nextLine();
		System.out.println("Grade?");
		grade1 = input.nextLine();
		System.out.println("Class 2?");
		class2 = input.nextLine();
		System.out.println("Grade?");
		grade2 = input.nextLine();
		System.out.println("Class 3?");
		class3 = input.nextLine();
		System.out.println("Grade?");
		grade3 = input.nextLine();
		Students.database.add(new Students(firstName, lastName, Period1,
				class1, grade1, Period2, class2, grade2, Period3, class3,
				grade3, GPA));

		makeGPA.createGPA();
		System.out.println(Students.database);
		// + "\n" + firstName + " " + lastName + " " + Period1 + "" + class1 +
		// " " + grade1 + " " + Period2 + " " + class2 + " " + grade2 + Period3
		// + " " + " " + class3 + " " + grade3);

		}

	public static void DeleteStudent() throws IOException
		{
		fillArray.createArraylist();
		String firstName;
		Scanner input = new Scanner(System.in);
		System.out.println("First name?");
		firstName = input.nextLine();
		for (int i = 0; i < Students.database.size(); i++)
			if (Students.database.get(i).getFirstName().equals(firstName))
				Students.database.remove(i);
		makeGPA.createGPA();
		System.out.println(Students.database);
		
		System.exit(0);
		}
	}
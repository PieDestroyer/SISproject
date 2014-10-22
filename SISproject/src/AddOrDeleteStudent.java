import java.util.Scanner;

public class AddOrDeleteStudent
	{

	public static void main(String[] args)
		{
		Intro();
		AddStudent();
		DeleteStudent();
		}

	public static void Intro()
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

			}
		}

	public static void AddStudent()
		{
		String firstName;
		String lastName;
		Scanner input = new Scanner(System.in);
		System.out.println("First name?");
		firstName = input.nextLine();
		System.out.println("Last name?");
		lastName = input.nextLine();
		System.out.println("Class 1?");
		lastName = input.nextLine();
		System.out.println("Last name?");
		lastName = input.nextLine();
		System.out.println("Last name?");
		lastName = input.nextLine();
		

		}

	public static void DeleteStudent()
		{

		}
	}
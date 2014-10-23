
public class makeGPA
	{

public static void createGPA()
{
	for (int i = 0; i < Students.database.size(); i++)
	{
		//set GPA from grade of class 1
		switch(Students.database.get(i).getGradeClass1())
		{
		case "A+": 
		{
			Students.database.get(i).setGPA(4.3);	
			break;
		}
		case "A": 
		{
			Students.database.get(i).setGPA(4.0);
			break;
		}
		case "A-": 
		{
			Students.database.get(i).setGPA(3.7);
			break;
		}
		case "B+": 
		{
			Students.database.get(i).setGPA(3.3);
			break;
		}
		case "B": 
		{
			Students.database.get(i).setGPA(3.0);
			break;
		}
		case "B-": 
		{
			Students.database.get(i).setGPA(2.7);
			break;
		}
		case "C+": 
		{
			Students.database.get(i).setGPA(2.3);
			break;
		}
		case "C": 
		{
			Students.database.get(i).setGPA(2.0);
			break;
		}
		case "C-": 
		{
			Students.database.get(i).setGPA(1.7);
			break;
		}
		case "D+": 
		{
			Students.database.get(i).setGPA(1.3);
			break;
		}
		case "D": 
		{
			Students.database.get(i).setGPA(1.0);
			break;
		}
		case "D-": 
		{
			Students.database.get(i).setGPA(0.7);
			break;
		}
		case "F+": 
		{
			Students.database.get(i).setGPA(0.3);
			break;
		}
		case "F": 
		{
			Students.database.get(i).setGPA(0.0);
			break;
		}
	}
	}
	for (int i = 0; i < Students.database.size(); i++)
	{
	//set GPA from grade of class 2
		switch(Students.database.get(i).getGradeClass2())
		{
		case "A+": 
		{
			Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 4.3)/2);	
			break;
		}
		case "A": 
		{
			Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 4.0)/2);
			break;
		}
		case "A-": 
		{
			Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 3.7)/2);
			break;
		}
		case "B+": 
		{
			Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 3.3)/2);
			break;
		}
		case "B": 
		{
			Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 3.0)/2);
			break;
		}
		case "B-": 
		{
			Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 2.7)/2);
			break;
		}
		case "C+": 
		{
			Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 2.3)/2);
			break;
		}
		case "C": 
		{
			Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 2.0)/2);
			break;
		}
		case "C-": 
		{
			Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 1.7)/2);
			break;
		}
		case "D+": 
		{
			Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 1.3)/2);
			break;
		}
		case "D": 
		{
			Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 1.0)/2);
			break;
		}
		case "D-": 
		{
			Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 0.7)/2);
			break;
		}
		case "F+": 
		{
			Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 0.3)/2);
			break;
		}
		case "F": 
		{
			Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 0.0)/2);
			break;
		}
	}
	}
	
	for (int i = 0; i < Students.database.size(); i++)
	{
		//set GPA from grade of class 3
				switch(Students.database.get(i).getGradeClass3())
				{
				case "A+": 
				{
					Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 4.3)/3);
					break;
				}
				case "A": 
				{
					Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 4.0)/3);
					break;
				}
				case "A-": 
				{
					Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 3.7)/3);
					break;
				}
				case "B+": 
				{
					Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 3.3)/3);
					break;
				}
				case "B": 
				{
					Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 3.0)/3);
					break;
				}
				case "B-": 
				{
					Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 2.7)/3);
					break;
				}
				case "C+": 
				{
					Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 2.3)/3);
					break;
				}
				case "C": 
				{
					Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 2.0)/3);
					break;
				}
				case "C-": 
				{
					Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 1.7)/3);
					break;
				}
				case "D+": 
				{
					Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 1.3)/3);
					break;
				}
				case "D": 
				{
					Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 1.0)/3);
					break;
				}
				case "D-": 
				{
					Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 0.7)/3);
					break;
				}
				case "F+": 
				{
					Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 0.3)/3);
					break;
				}
				case "F": 
				{
					Students.database.get(i).setGPA((Students.database.get(i).getGPA() + 0.0)/3);
					break;
				}
			}
			
	}
}
}



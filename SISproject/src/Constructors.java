
//Github edit and re-upload from home 

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Constructors
	{
	private static String firstName;
	private static String lastName;
	private static int Period1 = 1;
	private static String class1;
	private static String gradeClass1;
	private static int Period2 = 2;
	private static String class2;
	private static String gradeClass2;
	private static int Period3 = 3;
	private static  String class3;
	private static String gradeClass3;
	private static double GPA = 0;
	
	static ArrayList <Constructors> database = new ArrayList <Constructors> ();
	
public Constructors(String f, String l, int p1, String c1, String g1, int p2, String c2, String g2, int p3, String c3, String g3, double GpA)
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
	GPA = GpA; 
}

public static void createArraylist() throws IOException
{



Scanner file = new Scanner(new File("studentlist2.txt"));

int numberOfStudents = file.nextInt();

for(int i = 0; i < numberOfStudents; i++)
{
	firstName = file.next();
	lastName = file.next();
	class1 = file.next();
	gradeClass1 = file.next();
	class2 = file.next();
	gradeClass2 = file.next();
	class3 = file.next();
	gradeClass3 = file.next();
	
	database.add(new Constructors(firstName, lastName, Period1, class1, gradeClass1, Period2, class2, gradeClass2, Period3, class3, gradeClass3, GPA));
	
}

	}

public static void main(String[] args) throws IOException
{
	createArraylist();
	
	System.out.println(database);
}


public static String getFirstName() {
	return firstName;
}

public static void setFirstName(String firstName) {
	Constructors.firstName = firstName;
}

public static String getLastName() {
	return lastName;
}

public static void setLastName(String lastName) {
	Constructors.lastName = lastName;
}

public  static int getPeriod1() {
	return Period1;
}

public  static void setPeriod1(int period1) {
	Period1 = period1;
}

public  static String getClass1() {
	return class1;
}

public static void setClass1(String class1) {
	Constructors.class1 = class1;
}

public  static String getGradeClass1() {
	return gradeClass1;
}

public static void setGradeClass1(String gradeClass1) {
	Constructors.gradeClass1 = gradeClass1;
}

public  static int getPeriod2() {
	return Period2;
}

public  static void setPeriod2(int period2) {
	Period2 = period2;
}

public  static String getClass2() {
	return class2;
}

public static void setClass2(String class2) {
	Constructors.class2 = class2;
}

public static  String getGradeClass2() {
	return gradeClass2;
}

public static void setGradeClass2(String gradeClass2) {
	Constructors.gradeClass2 = gradeClass2;
}

public  static int getPeriod3() {
	return Period3;
}

public static void setPeriod3(int period3) {
	Period3 = period3;
}

public static  String getClass3() {
	return class3;
}

public static void setClass3(String class3) {
	Constructors.class3 = class3;
}

public static  String getGradeClass3() {
	return gradeClass3;
}

public static void setGradeClass3(String gradeClass3) {
	Constructors.gradeClass3 = gradeClass3;
}

public  static double getGPA() {
	return GPA;
}

public  static void setGPA(double gPA) {
	GPA = gPA;
}

public static ArrayList<Constructors> getDatabase() {
	return database;
}

public static void setDatabase(ArrayList<Constructors> database) {
	Constructors.database = database;
}

@Override
public  String toString() {
	return "\n" +firstName + " " + lastName+" " + Period1 +" " +  class1 + " " +gradeClass1 +" " +  Period2 +  " " +class2+ " " + gradeClass2 + " " + Period3+ " " +class3 + " " +gradeClass3 + " " +GPA;
}


}

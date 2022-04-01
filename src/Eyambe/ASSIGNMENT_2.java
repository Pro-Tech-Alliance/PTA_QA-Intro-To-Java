package Eyambe;


//package ASSIGNMENT_2;

import java.util.Scanner;

public class ASSIGNMENT_2 {

	 static Scanner sc = new Scanner(System.in);
	static String StudentName;
	static String Course = null;
	static String Grade;
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter student name :: ");
		StudentName = sc.nextLine();
		
		System.out.println("Enter Course :: ");
		Course = sc.nextLine();	
		
		System.out.println("Enter student grade (eg A) :: ");
		Grade = sc.nextLine();	

	System.out.println(StudentInformation(StudentName,Course) + Grade(Grade));
		

	}
	

	 public static String StudentInformation(String _Name, String _Course)
		{
		 	
		 	return  "Student name : "+_Name+"\nCourse : "+_Course;
			
		}
	 
	 
	 public static String Grade(String _Grade)
	 {
		 
		 return "\nStudent grade : "+_Grade;
	 }
	
	
}
